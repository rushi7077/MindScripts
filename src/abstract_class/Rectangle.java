package abstract_class;

public class Rectangle extends Area{
    @Override
    void acl_area() {
        System.out.println("Enter len and bre.");
        int len = sc.nextInt();
        int bre = sc.nextInt();

        area=len*bre;
    }
}
