public class Parent {

    Parent(int n){
        System.out.println("This is parent class constructor");
    }
}

class Child extends Parent {

    Child(){
        super(50);
        System.out.println("This is child class constructor");
    }


}

class main{
    public static void main(String[] args) {
        Child c = new Child();
    }
}
