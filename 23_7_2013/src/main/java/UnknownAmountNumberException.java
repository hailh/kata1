/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/23/13
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class UnknownAmountNumberException extends Exception{
    private String message = "";

    public String getMessage() {
        return message;
    }

    public UnknownAmountNumberException(Exception exception){
        this.message = exception.getMessage();
    }
}
