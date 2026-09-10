package abstract_class;

public class Square extends Area{
    @Override
    void acl_area() {
        System.out.println("Enter the side :");

        int side  = sc.nextInt();

        area = side*side;
    }
}
