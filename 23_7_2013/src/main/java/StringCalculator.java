/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/23/13
 * Time: 8:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static final String DEFAULT_DELIMITERS = ",";

    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        } else {
            int total = 0;
            String delimiter = DEFAULT_DELIMITERS;
            String[] listNumber = numbers.split(delimiter);
            for(String number : listNumber){
                int tempNumber = Integer.parseInt(number);
                total += tempNumber;
            }
            return total;
        }
    }
}
