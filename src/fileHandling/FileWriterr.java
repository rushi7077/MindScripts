package fileHandling;

import java.io.*;

public class FileWriterr {
    public static void main(String[] args) throws Exception {
        FileWriter f= new FileWriter("Hello.txt");

        String s = "Happy Diwali";
        f.write(s);
        f.close();
        f.close();
        System.out.println("Done");

        FileReader ff = new FileReader("file.txt");
        int i;
        while((i=ff.read())!=-1){
            System.out.print((char)i);
        }
    }
}
