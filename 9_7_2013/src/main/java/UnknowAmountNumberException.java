/**
 * Created with IntelliJ IDEA.
 * User: Dell 3360
 * Date: 7/9/13
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnknowAmountNumberException extends Exception {
    private String message;

    public String getMessage() {
        return message;
    }

    public UnknowAmountNumberException(Exception exception){
        this.message = exception.getMessage();
    }
}
