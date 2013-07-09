/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/8/13
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class StackEmptyException extends Exception{
    private String message;

    public String getMessage() {
        return message;
    }

    public StackEmptyException(Exception exception){
        this.message = exception.getMessage();
    }
}
