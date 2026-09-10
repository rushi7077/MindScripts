package practice2;

public class Employee{

    int Salary;

    public Employee(int Salary){
        this.Salary = Salary;
    }

    public void check() throws EmployeeException{
        if(Salary<0){
            throw new EmployeeException();
        }
        else System.out.println("Salary is : "+Salary);

    }

    public static void main(String[] args) {
        Employee e = new Employee(200000);
        try {
            e.check();
        } catch (EmployeeException ex) {
            ex.printStackTrace();
        }
    }
}
