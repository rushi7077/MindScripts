package abstract_class;

public class Triangle extends Area{
    @Override
    void acl_area() {
        System.out.println("Enter base and height ");
        int base = sc.nextInt();
        int height = sc.nextInt();

        area = 0.5*base*height;
    }
}
