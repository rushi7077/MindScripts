package practice2;

class User {

    public int userId;
    public String name;

    public User(int userId,String name){
        this.userId = userId;
        this.name=name;
    }

    public void showDetails(){
        System.out.println("Id is : "+userId);
        System.out.println("Name is : "+this.name);
    }

}
class Admin extends User{

    public Admin(int userId,String name){
        super(userId, name);
    }

    public void showPermissions(){
        System.out.println("You have permissions to add, delete, update the products.");
    }

}
class Customer extends User{

    public Customer(int userId, String name){
        super(userId, name);
    }

    public void showPurchaseHistory(){
        System.out.println("You have buy Laptop, Mouse, Headset.");
    }
}
public class Tester{
    public static void main(String[] args) {

        System.out.println("---Admin---");
        Admin a = new Admin(55,"Jonny");
        a.showDetails();
        a.showPermissions();

        System.out.println("---Customer---");
        Customer c = new Customer(44,"Tom");
        c.showDetails();
        c.showPurchaseHistory();
    }
}
