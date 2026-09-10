package inheritance;

public class Triangle extends Area{

    double base = sc.nextDouble();
    double height = sc.nextDouble();

    public void cal_area(){

        area = 0.5 * base * height;
    }
}
