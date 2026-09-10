package abstract_class;

public class Circle extends Area {

    @Override
    void acl_area() {
        System.out.println("Enter radius :");
        double radius = sc.nextInt();

        area=3.14*radius*radius;
    }
}
