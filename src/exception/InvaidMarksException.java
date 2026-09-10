package exception;

public class InvaidMarksException extends Exception{

    @Override
    public String toString() {
        return "Exception occured : Invaid marks( Your marks are not inbetween 0 to 100)";
    }
}
