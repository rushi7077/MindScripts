package fileHandling;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;

public class SerializationWrite {
    public static void main(String[] args) throws Exception{

        SerializationManager m = new SerializationManager(77,"Rushi","Pune",95000.00);

        FileOutputStream fo = new FileOutputStream("Obj.txt");
        ObjectOutputStream oo = new ObjectOutputStream(fo);

        oo.writeObject(m);;
        oo.flush();
        oo.close();
        System.out.println("Done");
    }
}
