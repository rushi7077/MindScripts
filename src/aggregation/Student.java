package aggregation;

public class Student {

    int id;
    String name;
    Address ad;

    public Student(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }

     public void display(){
        System.out.println("Id is :"+id+"Name is:"+name);
        ad.display();
    }

    public static void main(String[] args) {
        Address a = new Address("Pune","Maharashtra","India");
        Student s = new Student(77,
                "Rahul",
                a);
        s.display();
    }

}
