import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/23/13
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void addWithEmptyStringTest() throws UnknownAmountNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumberTest() throws UnknownAmountNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbersTest() throws UnknownAmountNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbersTest() throws UnknownAmountNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbersTest(){
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,\n2");
            assertTrue(false);
        } catch (UnknownAmountNumberException e) {
            assertTrue(true);
        }
    }

    @Test
    public void addWithStringHasNewDelimiterTest() throws UnknownAmountNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[;]\n1;2") == 3);
    }
}
