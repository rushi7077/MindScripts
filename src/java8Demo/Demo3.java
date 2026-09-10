package java8Demo;

interface Showable{
    public void show();

    default void de_method(){
        System.out.println("Default method");
        pr_method();
    }
    static void st_method(){
        System.out.println("Static method");
    }
    private void pr_method(){
        System.out.println("Private method");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Showable s = new Showable() {
            @Override
            public void show() {
                System.out.println("Public method");
            }
        };
        s.show();
        Showable.st_method();
        s.de_method();
    }
}
