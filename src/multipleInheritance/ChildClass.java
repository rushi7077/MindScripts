package multipleInheritance;


public class ChildClass implements Showable,Callable {

    @Override
    public void call(int n, String s) {
        System.out.println(s+" called "+n+" times.");
    }

    @Override
    public void show() {
        System.out.println("This is show method.");
    }

    @Override
    public void message() {
        System.out.println("This is message method.");

    }

    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.call(5,"Ram");
        c.show();
        c.message();
    }
}
