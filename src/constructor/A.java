package constructor;

import java.util.Scanner;

public class A {

    public A(int a) {
        System.out.println("This is constructor of class A " + a);
    }
}

class B extends A {

    public B(int a, int b) {
        super(a);
        System.out.println("This is constructor of class B " + b);
    }
}

class C extends A {

    public C(int a, int b, int c) {
        super(a);
        System.out.println("This is constructor of class C " + c);
    }
}

class D extends C {

    public D(int a, int b, int c, int d) {
        super(a, b, c);
        System.out.println("This is constructor of class D " + d);
    }
}

class E extends C {

    public E(int a, int b, int c, int e) {
        super(a, b, c);
        System.out.println("This is constructor of class E " + e);
    }
}

class F extends C {

    public F(int a, int b, int c, int f) {
        super(a, b, c);
        System.out.println("This is constructor of class F " + f);
    }
}


class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter class name:");
        String cl = sc.next();

        switch (cl.toUpperCase()) {

            case "A":
                A objA = new A(10);
                break;

            case "B":
                B objB = new B(10, 20);
                break;

            case "C":
                C objC = new C(10, 20, 30);
                break;

            case "D":
                D objD = new D(10, 20, 30, 40);
                break;

            case "E":
                E objE = new E(10, 20, 30, 50);
                break;

            case "F":
                F objF = new F(10, 20, 30, 60);
                break;

            default:
                System.out.println("Invalid class name");
        }

        sc.close();
    }
}
