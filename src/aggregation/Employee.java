package aggregation;

public class Employee {
    String name;
    int salary;
    Address ad;

    public Employee(String name, int salary, Address ad) {
        this.name = name;
        this.salary = salary;
        this.ad = ad;
    }

    public void display(){
        System.out.println("Nmae is:"+name+"Salary is:"+salary);
        ad.display();
    }

    public static void main(String[] args) {
        Address a = new Address("Mumbai","Maharashtra","India");
        Employee e = new Employee("Rahul dalwi",5000,a);
        e.display();
    }
}
