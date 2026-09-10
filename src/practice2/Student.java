package practice2;

public class Student {

    int marks;

    public Student(int marks){
        this.marks = marks;
    }

    public void check() throws Exception{
        if(marks<=0 || marks>100){
            throw new Exception("Exception occured : Marks should be in between 1 - 100.");
        }
        else System.out.println("The marks are : "+marks);
    }

    public static void main(String[] args) {
        Student s = new Student(-1100);
        try {
            s.check();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
