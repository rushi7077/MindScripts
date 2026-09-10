package exception;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age.");

        int age = sc.nextInt();

        if(age<18){
            throw new Exception("You are under aged");
        }

        else System.out.println("You are eligible for voting");


    }
}
