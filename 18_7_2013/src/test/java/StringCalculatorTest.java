import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/18/13
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void addWithEmptyStringTest() {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }

    @Test
    public void addWithStringHasOneNumberTest() {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1") == 1);
    }

    @Test
    public void addWithStringHasTwoNumbersTest() {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,2") == 3);
    }

    @Test
    public void addWithStringHasNewLineValidBetweenNumbersTest() {
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1\n2,3") == 6);
    }

    @Test
    public void addWithStringHasNewLineInvalidBetweenNumbersTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1,\n2")== 3);
    }

    @Test
    public void addWithStringHasNewDelimiterTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[;]\n1;2") == 3);
    }

    @Test
    public void addWithStringHasNumberGreater1000Test(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("1001,2") == 2);
    }

    @Test
    public void addWithStringHasNewDelimiterWithAnyLengthTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[---]\n1---2") == 3);
    }

    @Test
    public void addWithStringHasManyDelimiterTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[a][b]\n1a2b3") == 6);
    }

    @Test
    public void addWithStringHasManyDelimiterLengthGreaterThanOneTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("//[aaa][bb]\n1aaa2bb3") == 6);
    }
}
