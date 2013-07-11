/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/10/13
 * Time: 1:55 PM
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
                    number = number > 1000 ? 0 : number;
                    if(number < 0) throw new NegativeNumberException();
                    return number;
                } else {
                    if(numbers.contains("\n")) {
                        numbers = numbers.replaceAll("\n", delimiter);
                        int number1 = Integer.parseInt(numbers.split(delimiter)[0]);
                        int number2 = Integer.parseInt(numbers.split(delimiter)[1]);
                        int number3 = Integer.parseInt(numbers.split(delimiter)[2]);
                        number1 = number1 > 1000 ? 0 : number1;
                        number2 = number2 > 1000 ? 0 : number2;
                        number3 = number3 > 1000 ? 0 : number3;
                        if(number1 < 0 || number2 < 0 || number3 < 0)
                            throw new NegativeNumberException();
                        return number1 + number2 + number3;
                    } else {
                        int number1 = Integer.parseInt(numbers.split(delimiter)[0]);
                        int number2 = Integer.parseInt(numbers.split(delimiter)[1]);
                        number1 = number1 > 1000 ? 0 : number1;
                        number2 = number2 > 1000 ? 0 : number2;
                        if(number1 < 0 || number2 < 0) throw new NegativeNumberException();
                        return number1 + number2;
                    }
                }
            }
        } catch (Exception exception) {
            throw new UnknowAmountNumberException(exception);
        }
    }
}
