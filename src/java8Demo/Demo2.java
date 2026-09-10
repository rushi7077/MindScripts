package java8Demo;

abstract class Shape{
    public abstract void area(double r);
}
public class Demo2 {
    public static void main(String[] args) {
        Shape s = new Shape() {
            @Override
            public void area(double r) {
                System.out.println("Area is "+3.14*r*r);

            }
        };
        s.area(5.6);
    }
}
