package exception;

public class Student {

    public static void check(int marks) throws FailedException{
        if(marks<40){
            throw new FailedException();
        }
        else System.out.println("You are passed.");
    }

    public static void main(String[] args) {
        try {
            check(5);
        } catch (FailedException e) {
            e.printStackTrace();
        }
    }
}
