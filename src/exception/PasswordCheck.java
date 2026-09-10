package exception;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) throws WeakPasswordException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the password : ");
        String password = sc.nextLine();


        if (password.length() < 8) {
            throw new WeakPasswordException();
        }
        else System.out.println("Password accepted.");


    }
}
