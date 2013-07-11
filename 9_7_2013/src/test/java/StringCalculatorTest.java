import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/9/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {

    @Test
    public void addWithEmptyString() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumber() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbers() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbers() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbers() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,\n2") == 3);
    }

    @Test
    public void addWithStringHasNewDelimiter() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//;\n1;2") == 3);
    }
}
