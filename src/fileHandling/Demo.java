package fileHandling;

import java.io.FileOutputStream;

public class Demo {

    public static void main(String[] args) throws Exception {

        FileOutputStream fo = new FileOutputStream("file.txt");

        String s = "Happy Ganesh Chaturthi";

        byte[] b = s.getBytes();

        fo.write(b);
        fo.flush();
        fo.close();

        System.out.println("Done");
    }
}
