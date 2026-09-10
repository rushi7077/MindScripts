package operation;

public class Cylinder implements Operations{
    @Override
    public void area(int r, int h) {
        double area = (2*pi*r*h)+(2*pi*r*2);
        System.out.println("Area is :"+area);
    }

    @Override
    public void volume(int r, int h) {
        double volume = pi*r*2*h;
        System.out.println("Volume is :"+volume);

    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.area(4,50);
        c.volume(6,80);
    }
}
