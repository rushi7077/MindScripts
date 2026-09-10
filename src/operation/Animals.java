package operation;

public interface Animals {
    void cats();
    void dogs();
}
class Cat implements Animals{

    @Override
    public void cats() {
        System.out.println("Cat sounds meow meow");

    }

    @Override
    public void dogs() {

    }
}
class Dog implements Animals{
    @Override
    public void dogs() {
        System.out.println("Dogs sound bhow bhow");

    }

    @Override
    public void cats() {

    }
}
class main{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.cats();
        Dog d = new Dog();
        d.dogs();
    }
}
