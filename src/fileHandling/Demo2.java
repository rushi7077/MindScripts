package fileHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Demo2 {
    public static void main(String[] args) throws Exception {

        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(str);

        System.out.println("Enter the details");
        String details = br.readLine();

        System.out.println("Enter the id");
        String id = br.readLine();
        int idd = Integer.parseInt(id);

        System.out.println(details);
        System.out.println(idd);

    }
}
