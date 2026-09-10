package superr;

public class Child extends Parent{

    Child(int n){
        super(n);
        System.out.println("This is child");
        System.out.println(n);
    }
}
