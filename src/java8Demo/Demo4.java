package java8Demo;

import java.sql.SQLOutput;

interface Caallable{
    void call();
}

interface Addablee{
    void add(int a, int b);

}
interface single{
    void print(int a);
}
interface EvenOdd{
    String check(int n);
}

public class Demo4 {
    public static void main(String[] args) {

    Addablee ad  = (a,b)-> System.out.println(a+b);
    ad.add(56,78);

    Caallable c1 = ()-> {
       System.out.println("Method");
    };
    c1.call();

    single s=a-> System.out.println(a);
    s.print(25);

    EvenOdd obj=n -> {
        if(n%2==0){
            return "Even";
        }
        else return "Odd";
    };
        System.out.println(obj.check(45));
        System.out.println(obj.check(18));
        System.out.println(obj.check(7));

    }
}
