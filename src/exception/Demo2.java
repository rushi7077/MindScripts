package exception;

public class Demo2 {

    public static void main(String[] args) {
        /*System.out.println("Hello");
        Thread.sleep(5000);
        System.out.println("World");*/

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("World");
    }
}
