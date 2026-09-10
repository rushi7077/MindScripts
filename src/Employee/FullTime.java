package Employee;

public class FullTime extends  Staff{
    int salary,bonus;

    public FullTime(String address, String name, int salary, int bonus) {
        super(address, name);
        this.salary = salary;
        this.bonus = bonus;
    }
    void display(){
        super.display();
        System.out.println("Salary is :"+ (salary+bonus));
    }
}
