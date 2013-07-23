/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/23/13
 * Time: 8:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static final String DEFAULT_DELIMITERS = ",|\n";
    public static final String POSTFIX_OF_NEW_DELIMITERS = "//";
    public static final String SEPARATE_DELIMITERS_AND_NUMBERS = "\n";
    public static final int MAX_NUMBER = 1000;

    public int add(String numbers) throws UnknownAmountNumberException {
        if(numbers.isEmpty()) {
            return 0;
        } else {
            int total = 0;
            String delimiter = DEFAULT_DELIMITERS;
            if(numbers.contains(POSTFIX_OF_NEW_DELIMITERS)){
                String delimiterStringPath = numbers.split(SEPARATE_DELIMITERS_AND_NUMBERS)[0].replace(POSTFIX_OF_NEW_DELIMITERS, "");
                String newDelimiter = delimiterStringPath.substring(1,delimiterStringPath.length()-1);
                delimiter += "|" + newDelimiter;
                numbers = numbers.substring(numbers.indexOf(SEPARATE_DELIMITERS_AND_NUMBERS) + 1, numbers.length());
            }
            try {
                String[] listNumber = numbers.split(delimiter);
                for(String number : listNumber){
                    int tempNumber = (Integer.parseInt(number) > MAX_NUMBER ? 0 : Integer.parseInt(number));
                    total += tempNumber;
                }
                return total;
            } catch (Exception exception) {
                throw new UnknownAmountNumberException(exception);
            }
        }
    }
}
