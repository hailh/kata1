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
    public void addWithEmptyStringTest() {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumberTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbersTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbersTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbersTest()  {
        StringCalculator calculator = new StringCalculator();
        try {
            calculator.add("1,\n2");
            assertTrue(false);
        } catch (Exception exception){
            assertTrue(true);
        }
    }

    @Test
    public void addWithStringHasNewDelimiterTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//;\n1;2") == 3);
    }

    @Test
    public void addWithStringHasNumberGreater1000Test()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1001,2") == 2);
    }

    @Test
    public void addWithStringHasNewDelimiterWithAnyLengthTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[---]\n1---2") == 3);
    }

    @Test
    public void addWithStringHasManyDelimiterTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[*][%]\\n1*2%3") == 6);
    }

    @Test
    public void addWithStringHasManyDelimiterLengthGreaterThanOneTest()  {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[**][%]\\n1**2%3") == 6);
    }
}
