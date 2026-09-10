package interfaceDemo;

/*


interface Camera{
    void takePhoto();
}
interface AudioPlayer{
    void playAudio();
}

class SmartPhone implements Camera, AudioPlayer{

    @Override
    public void playAudio() {
        System.out.println("Photo is clicked.");
    }

    @Override
    public void takePhoto() {
        System.out.println("Music is playing.");
    }

    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.playAudio();
        s.takePhoto();

    }
}*/




/*
import java.util.Scanner;

interface Bonus{
    void calculate_bonus(double salary);
}
class Manager implements Bonus{

    @Override
    public void calculate_bonus(double salary) {
        System.out.println("Bonus is "+salary*0.2);
    }
}
class Developer implements Bonus{

    @Override
    public void calculate_bonus(double salary) {
        System.out.println("Bonus is "+salary*0.3);

    }
}
class Tester implements Bonus{

    @Override
    public void calculate_bonus(double salary) {
        System.out.println("Bonus is "+salary*0.1);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Which position's bonus do you want to check :");
        String position = sc.next();

        switch (position.toUpperCase()){
            case "MANAGER":{
                Manager m = new Manager();
                m.calculate_bonus(50000);
                break;
            }
            case "DEVELOPER":{
                Developer d = new Developer();
                d.calculate_bonus(60000);
                break;
            }
            case "TESTER":{
                Tester t = new Tester();
                t.calculate_bonus(40000);
                break;
            }
            default:
                System.out.println("Invalid position");
        }
    }
}

 */

interface Booking{

    void bookTicket(String type);

    void cancelTicket(String type);
}
class Movie implements Booking{

    @Override
    public void bookTicket(String type) {
        System.out.println("Ticket of "+type+" get booked.");
    }

    @Override
    public void cancelTicket(String type) {
        System.out.println("Ticket of "+type+" get cancelled.");

    }
}
class Train implements Booking{

    @Override
    public void bookTicket(String type) {
        System.out.println("Ticket of "+type+" get booked.");
    }

    @Override
    public void cancelTicket(String type) {
        System.out.println("Ticket of "+type+" get cancelled.");

    }
}
public class Main{
    public static void main(String[] args) {
        Movie m = new Movie();
        Train t = new Train();

        m.bookTicket("movie");
        t.bookTicket("train");

        m.cancelTicket("movie");
        m.cancelTicket("train");
    }
}


