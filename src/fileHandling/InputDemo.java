package fileHandling;

import java.io.FileInputStream;

public class InputDemo {

    public static void main(String[] args) throws Exception {

        FileInputStream fi = new FileInputStream("file.txt");

        int i ;
        while((i=fi.read())!= -1){
            System.out.print((char) i);
        }
        fi.close();

    }
}
