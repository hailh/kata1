/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/9/13
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public int add(String numbers) throws UnknowAmountNumberException, NegativeNumberException {
        try {
            if(numbers.isEmpty()) {
                return 0;
            } else {
                String delimiter = ",";
                if(numbers.split("\n")[0].contains("//")){
                    delimiter = numbers.split("\n")[0].replace("//", "");
                    numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
                }
                if(numbers.split(delimiter).length == 1){
                    int number = Integer.parseInt(numbers.split(delimiter)[0]);
                    return number;
                } else {
                    if(numbers.contains("\n")) {
                        numbers = numbers.replaceAll("\n", delimiter);
                        return Integer.parseInt(numbers.split(delimiter)[0]) + Integer.parseInt(numbers.split(delimiter)[1])+
                                Integer.parseInt(numbers.split(delimiter)[2]);
                    }
                    return Integer.parseInt(numbers.split(delimiter)[0]) + Integer.parseInt(numbers.split(delimiter)[1]);
                }
            }
        } catch (Exception exception) {
            throw new UnknowAmountNumberException(exception);
        }
    }
}
