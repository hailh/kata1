import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: hailh
 * Date: 7/8/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {

    @Test
    public void createNewStackWithSizeEqualZeroTest(){
        Stack stack = new Stack();
        assertTrue(stack.size() == 0);
    }

    @Test
    public void pushOneElementToEmptyStackAndSizeEqualOneTest(){
        Stack stack = new Stack();
        String element = "Sample 1";
        stack.push(element);
        assertTrue(stack.size() == 1);
    }

    @Test
    public void pushOneElementToStackWithSizeEqualKAndSizeIncreaseToKPlusOneTest(){
        Stack stack = new Stack();
        String element1 = "Sample 1";
        stack.push(element1);
        int oldSize = stack.size();

        String element2 = "Sample 2";
        stack.push(element2);
        assertTrue(stack.size() == oldSize +1);
    }

    @Test
    public void topEmptyStackAndReturnNullTest(){
        Stack stack = new Stack();
        assertTrue(stack.top() == null);
    }

    @Test
    public void topStackHasOneElementAndReturnThisElementTest(){
        Stack stack = new Stack();
        String element1 = "Sample 1";
        stack.push(element1);

        assertTrue(stack.top().equals(element1));
    }

    @Test
    public void popEmptyStackAndGetStackEmptyExceptionTest() throws StackEmptyException {
        Stack stack = new Stack();

        assertTrue(stack.pop() == "");
    }

    @Test
    public void popStackHasKElementAndSizeDecreaseToKMinusOneTest() throws StackEmptyException {
        Stack stack = new Stack();
        String element1 = "Sample 1";
        stack.push(element1);
        int oldSize = stack.size();
        stack.pop();

        assertTrue(stack.size() == oldSize - 1);
    }

    @Test
    public void popStackHasOneElementSoStackIsEmptyTest() throws StackEmptyException {
        Stack stack = new Stack();
        String element1 = "Sample 1";
        stack.push(element1);
        stack.pop();

        assertTrue(stack.size() == 0);
    }

    @Test
    public void topStackHasKElementAndReturnElementEqualWithPopReturnedTest() throws StackEmptyException {
        Stack stack = new Stack();
        String element1 = "Sample 1";
        stack.push(element1);
        String topElement = stack.top();
        String popElement = stack.pop();

        assertTrue(topElement.equals(popElement));
    }

    @Test
    public void pushToEmptyStackAndGetReserveOneAfterPopAndStackIsEmptyTest() throws StackEmptyException {
        Stack stack = new Stack();
        String[] input = new String[2];
        input[0] = "Sample 1";
        input[1] = "Sample 1";
        for(String str : input){
            stack.push(str);
        }

        String[] output = new String[2];
        int index = 0;
        while (stack.size() != 0){
            output[index] = stack.pop();
            ++index;
        }

        assertTrue(checkReversed(input, output));
        assertTrue(stack.size() == 0);
    }

    public static boolean checkReversed(String[] x, String[] y)
    {
        if (x.length != y.length)
        {
            return false;
        }
        for (int i = 0; i < x.length; i++)
        {
            if (x[i] != y[y.length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}
