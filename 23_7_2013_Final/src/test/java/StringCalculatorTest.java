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
    public void addWithEmptyStringTest(){
        StringCalculator calculator = new StringCalculator();
        assertTrue(calculator.add("") == 0);
    }
}
