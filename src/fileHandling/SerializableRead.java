package fileHandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializableRead {
    public static void main(String[] args) throws Exception {


        FileInputStream fi = new FileInputStream("Obj.txt");
        ObjectInputStream oi = new ObjectInputStream(fi);

        SerializationManager m = (SerializationManager) oi.readObject();
        System.out.println(m);


    }
}
