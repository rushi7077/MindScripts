package inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.cal_area();
        r.displayArea("Rectangle");

        Circle c = new Circle();
        c.cal_area();
        c.displayArea("Circle");

        Triangle t = new Triangle();
        t.cal_area();
        t.displayArea("Triangle");


    }


}
