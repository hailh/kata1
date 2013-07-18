/**
* Created with IntelliJ IDEA.
* User: Dell 3360
* Date: 7/18/13
* Time: 1:50 PM
* To change this template use File | Settings | File Templates.
*/
public class UnknownAmountNumberException extends Exception {
    private String message = "";
    public UnknownAmountNumberException(Exception exception) {
        this.message = exception.getMessage();
    }

    public String getMessage() {
        return message;
    }
}
