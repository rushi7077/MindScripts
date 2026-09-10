package encapsulation;

public class main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setNo(77);
        s.setName("Rahul");
        s.setAddress("Pune");
        s.setMarks(99);

        System.out.println("Number is :"+s.getNo());
        System.out.println("Name is :"+s.getName());
        System.out.println("Address is :"+s.getAddress());
        System.out.println("Marks are "+s.getMarks());
    }
}
