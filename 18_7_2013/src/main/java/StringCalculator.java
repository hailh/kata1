/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/18/13
 * Time: 1:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static final String DEFAULT_DELIMITERS = ",";
    public int add(String numbers) throws NegativeNumberException, UnknownAmountNumberException {
        try {
            if(numbers.isEmpty()) {
                return 0;
            } else {
                String delimiter = DEFAULT_DELIMITERS;
                if(numbers.split("\n")[0].contains("//")){
                    String delimiterStringPath = numbers.split("\n")[0].replace("//", "");
                    String[] listDelimiter = delimiterStringPath.substring(1,delimiterStringPath.length()-1).split("\\]\\[");
                    for(String item : listDelimiter){
                        delimiter += "|" + item;
                    }
                    numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
                }
                if(numbers.split(delimiter).length == 1){
                    int number = Integer.parseInt(numbers.split(delimiter)[0]);
                    number = number > 1000 ? 0 : number;
                    if(number < 0) throw new NegativeNumberException();
                    return number;
                } else {
                    int total = 0;
                    if(numbers.contains("\n")) {
                        numbers = numbers.replaceAll("\n", delimiter);
                    }
                    String[] listNumber = numbers.split(delimiter);
                    for(String number : listNumber){
                        int tempNumber = (Integer.parseInt(number) > 1000 ? 0 : Integer.parseInt(number));
                        if(tempNumber < 0) throw new NegativeNumberException();
                        total += tempNumber;
                    }
                    return total;
                }
            }
        } catch (Exception exception) {
            throw new UnknownAmountNumberException(exception);
        }
    }
}
