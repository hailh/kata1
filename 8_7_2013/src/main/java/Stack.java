import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/8/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stack {
    List<String> stack;

    public Stack(){
        stack= new ArrayList<String>();
    }

    public int size() {
        return stack.size();
    }

    public void push(String element) {
        stack.add(element);
    }

    public String top() {
        if(stack.size() == 0){
            return null;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public String pop() throws StackEmptyException {
        try {
            String result = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return result;
        } catch (Exception exception){
            throw new StackEmptyException(exception);
        }
    }
}
