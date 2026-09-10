package encapsulation;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id:");
        int id = sc.nextInt();
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter address:");
        String address = sc.next();
        System.out.println("Enter email:");
        String email = sc.next();
        System.out.println("Enter department:");
        String department = sc.next();
        System.out.println("Enter salary:");
        Double salary = sc.nextDouble();

        Employee e = new Employee();

        e.setAddress(address);
        e.setDepartment(department);
        e.setEmail(email);
        e.setId(id);
        e.setName(name);
        e.setSalary(salary);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getDepartment());
        System.out.println(e.getEmail());
        System.out.println(e.getSalary());
        System.out.println(e.getAddress());
    }
}
