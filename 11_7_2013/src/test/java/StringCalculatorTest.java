import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/11/13
 * Time: 1:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void addWithEmptyStringTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumberTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbersTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbersTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbersTest(){
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,\n2");
            assertTrue(false);
        } catch (NegativeNumberException e) {
            assertTrue(true);
        } catch (UnknownAmountNumberException e) {
            assertTrue(true);
        }
    }

    @Test
    public void addWithStringHasNewDelimiterTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//;\n1;2") == 3);
    }

    @Test
    public void addWithStringHasNumberGreater1000Test() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1001,2") == 2);
    }

    @Test
    public void addWithStringHasNewDelimiterWithAnyLengthTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[---]\n1---2") == 3);
    }

    @Test
    public void addWithStringHasManyDelimiterTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[*][%]\n1*2%3") == 6);
    }

    @Test
    public void addWithStringHasManyDelimiterLengthGreaterThanOneTest() throws UnknownAmountNumberException, NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[**][%]\n1**2%3") == 6);
    }
}
