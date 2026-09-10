package exception;

public class FailedException extends Exception{

    @Override
    public String toString() {
        return "Exception occured : You are fail";
    }
}
