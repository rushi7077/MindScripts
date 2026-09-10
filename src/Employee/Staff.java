package Employee;

public class Staff {

    String name,address;

    public Staff(String address, String name) {
        this.address = address;
        this.name = name;
    }

    void display(){
        System.out.println("Name is :"+name);
        System.out.println("Address is :"+address);
    }
}
