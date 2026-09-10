package Employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PTS for Part time ");
        System.out.println("Enter FTS for Full time ");

        String salary = sc.next();

        if(salary.equalsIgnoreCase("pts")){
            PartTime obj = new PartTime("Pune","Ram",50,9);
            obj.display();
        }
        else if(salary.equalsIgnoreCase("fts")){
            FullTime obj = new FullTime("Mumbai","Shyam",50000,10000);
            obj.display();
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}