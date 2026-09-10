package java8Demo;

interface SquareofNumber{
    int square(int n);
}

interface PositiveOrNegative{
    String check(int n);
}
interface NoofDidits{
    int check(int n);
}
public class LamdaPratice {
    public static void main(String[] args) {

        SquareofNumber sq =n->{
            return (n*n);
        };
        System.out.println(sq.square(625));

        PositiveOrNegative pn =n->{
            if(n>0){
                return "Positive";
            }
            else return "Negative";
        };
        System.out.println(pn.check(55));
        System.out.println(pn.check(-8));

        NoofDidits no =n -> {
            int count = 0;
            while(n!=0){
                count++;
                n/=10;
            }
            return count;
        };
        System.out.println(no.check(4563));
        System.out.println(no.check(456864846));

    }
}
