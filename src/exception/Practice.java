package exception;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Program executed.");
        }*/

        /*int arr[] ={5,7,8,4,2};
        try{
            System.out.println(arr[2]);
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Program executed.");
        }*/

        Scanner sc = new Scanner(System.in);
        try {
            int deposit = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            int withdraw = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
