package exception;

public class WeakPasswordException extends  Exception{

    @Override
    public String toString() {
        return "Exception occured : You enter weak password.";
    }
}
