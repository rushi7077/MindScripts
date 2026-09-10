package exception;

import java.util.Scanner;

public class EvenNumber {
    public static void main (String[] args) throws EvenNumberException{

        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
            throw new EvenNumberException();
        }

        else System.out.println("Number is odd");

    }
}
