package superr;

public class GrandChild extends Child{
    GrandChild(int n){
        super(n);
        System.out.println("This is Grand Child");
        System.out.println(n);
    }
}
