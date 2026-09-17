package multiThreading;

public class Demo1 extends Thread{

    @Override
    public void run(){
        System.out.println("Thread name is "+Thread.currentThread().getName());
        System.out.println("Welcome");
    }

    public static void main(String[] args) {

        Demo1 d = new Demo1();
        d.start();
        System.out.println(Thread.currentThread().getName());


    }
}
