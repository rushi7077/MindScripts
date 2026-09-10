package abstract_class;

import java.util.Scanner;

public abstract class Area {

    double area;
    Scanner sc = new Scanner(System.in);

    abstract void acl_area();

    public void display_Area(){
        System.out.println("Area is "+area);
    }
}
