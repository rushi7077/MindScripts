package interfaceDemo;

public class Addition implements Addable{
    @Override
    public void add() {
        System.out.println("This is addition");

    }

    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Addition a = new Addition();

        a.add();
        a.add(5,4);
    }
}
