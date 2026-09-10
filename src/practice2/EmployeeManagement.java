package practice2;

class Employeee{

    public void calculateSalary(int Salary){

    }
}

class Developer extends Employeee{

    int bonus;

    public Developer(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary(int Salary) {
        System.out.println("Salary of developer : "+(Salary+bonus));
    }
}

class Manager extends Employeee{

    int hour;
    int rate;

    public Manager(int hour, int rate) {
        this.hour = hour;
        this.rate = rate;
    }

    @Override
    public void calculateSalary(int Salary) {
        System.out.println("Salary of manager : "+(Salary+(hour*rate)));
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        System.out.println("---Developer---");
        Developer d = new Developer(5000);
        d.calculateSalary(50000);

        System.out.println("---Manager---");
        Manager m = new Manager(22,200);
        m.calculateSalary(60000);

    }
}
