package java8Demo;

interface Addable {

    public void add();

    public void add(int a,int b);

}
public class Demo1{
    public static void main(String[] args) {

        Addable ad = new Addable() {
            @Override
            public void add() {
                System.out.println("Addable");

            }

            @Override
            public void add(int a, int b) {
                System.out.println(a+b);

            }
        };
        ad.add();
        ad.add(5,6);

    }
}
