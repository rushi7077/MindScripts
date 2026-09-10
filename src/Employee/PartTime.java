package Employee;

public class PartTime extends Staff{

    int rate,hour;

    public PartTime(String address, String name, int rate, int hour) {
        super(address, name);
        this.rate = rate;
        this.hour = hour;
    }

    void display(){
        super.display();
        System.out.println("Salary is :"+(rate*hour));
    }
}
