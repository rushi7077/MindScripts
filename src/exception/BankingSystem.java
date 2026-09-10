package exception;

import java.util.Scanner;

public class BankingSystem extends Exception{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the balance : ");
         int balance = sc.nextInt();

        System.out.print("Enter the withdraw amount : ");
        int withdraw = sc.nextInt();

        if(withdraw>balance){
            throw new Exception("Insufficient fund");
        }

        else{
            System.out.println("Your balance was : "+balance);
            System.out.println("You withdraw Rs : "+withdraw);
            System.out.println("Your remaining balance is :"+(balance-withdraw));
        }
    }
}
