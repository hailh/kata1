import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/10/13
 * Time: 1:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void addWithEmptyStringTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumberTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbersTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbersTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbersTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,\n2");
        } catch (Exception exception){
            assertTrue(true);
        }
    }

    @Test
    public void addWithStringHasNewDelimiterTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//;\n1;2") == 3);
    }

    @Test
    public void addWithStringHasNumberGreater1000Test() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1001,2") == 2);
    }

    @Test
    public void addWithStringHasNewDelimiterWithAnyLengthTest() throws UnknowAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//---\n1---2") == 3);
    }
}
