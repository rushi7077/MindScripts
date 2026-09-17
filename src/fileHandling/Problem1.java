package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;

public class Problem1 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("Hello.txt");
        FileWriter fw = new FileWriter("Hi.txt");

        int ch;

        while((ch=fr.read())!=-1){

            fw.write(ch);

            fr.close();
            fw.close();

            System.out.println("File copied Successfully");

        }
    }
}
