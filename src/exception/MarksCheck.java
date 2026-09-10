package exception;

import java.util.Scanner;

public class MarksCheck {
    public static void main(String[] args) throws InvaidMarksException{

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks :");

        int marks = sc.nextInt();

        if (marks>100 || marks <1) {
            throw new InvaidMarksException();
        }
        else System.out.println("Your marks are valid.");


    }
}
