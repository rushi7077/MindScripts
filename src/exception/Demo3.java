package exception;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Hello");

        try{
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("World");

        try{
            int arr[]={5,4,2,3,6};
            System.out.println(arr[0]);
            System.out.println(arr[3]);
            System.out.println(arr[8]);
        } /*catch (Exception e) {
            e.printStackTrace();
        }*/

        finally {
            System.out.println("Program get executed.");
        }
    }
}
