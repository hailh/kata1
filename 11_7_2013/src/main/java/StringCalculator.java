/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/11/13
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    //   \\[.+\\]
    public int add(String numbers) throws NegativeNumberException, UnknownAmountNumberException {
        try {
            if(numbers.isEmpty()) {
                return 0;
            } else {
                String delimiter = ",";
                if(numbers.split("\n")[0].contains("//")){
                    delimiter = numbers.split("\n")[0].replace("//", "").replace("[", "").replace("]", "");
                    numbers = numbers.substring(numbers.indexOf("\n") + 1, numbers.length());
                }
                if(numbers.split(delimiter).length == 1){
                    int number = Integer.parseInt(numbers.split(delimiter)[0]);
                    number = number > 1000 ? 0 : number;
                    if(number < 0) throw new NegativeNumberException();
                    return number;
                } else {
                    if(numbers.contains("\n")) {
                        numbers = numbers.replaceAll("\n", delimiter);
                        int number1 = (Integer.parseInt(numbers.split(delimiter)[0]) > 1000 ? 0 : Integer.parseInt(numbers.split(delimiter)[0]));
                        int number2 = (Integer.parseInt(numbers.split(delimiter)[1]) > 1000 ? 0 : Integer.parseInt(numbers.split(delimiter)[1]));
                        int number3 = (Integer.parseInt(numbers.split(delimiter)[2]) > 1000 ? 0 : Integer.parseInt(numbers.split(delimiter)[2]));
                        if(number1 < 0 || number2 < 0 || number3 < 0)
                            throw new NegativeNumberException();
                        return number1 + number2 + number3;
                    } else {
                        int number1 = (Integer.parseInt(numbers.split(delimiter)[0]) > 1000 ? 0 : Integer.parseInt(numbers.split(delimiter)[0]));
                        int number2 = (Integer.parseInt(numbers.split(delimiter)[1]) > 1000 ? 0 : Integer.parseInt(numbers.split(delimiter)[1]));
                        if(number1 < 0 || number2 < 0) throw new NegativeNumberException();
                        return number1 + number2;
                    }
                }
            }
        } catch (Exception exception) {
            throw new UnknownAmountNumberException(exception);
        }
    }
}
