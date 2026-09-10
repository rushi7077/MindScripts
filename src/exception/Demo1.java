package exception;

public class Demo1 {
    public static void main(String[] args) {
        /*System.out.println("Hello");
        System.out.println(10/0);
        System.out.println("World");*/

        System.out.println("Hello");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("World");
    }
}
