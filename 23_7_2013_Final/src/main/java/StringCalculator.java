/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/23/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static final String DEFAULT_DELIMITERS = ",|\n";
    public int add(String numbers) throws UnknownAmountNumberException {
        if(numbers.isEmpty()) {
            return 0;
        } else {
            try {
                int total = 0;
                String[] listNumber = numbers.split(DEFAULT_DELIMITERS);
                for(String number : listNumber){
                    int tempNumber = Integer.parseInt(number);
                    total += tempNumber;
                }
                return total;
            } catch (Exception exception) {
                throw new UnknownAmountNumberException(exception);
            }
        }
    }
}
