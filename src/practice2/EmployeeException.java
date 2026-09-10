package practice2;

public class EmployeeException extends Exception{

    @Override
    public String toString() {
        return "Exception occured : Salary should be greater than 0.";
    }
}
