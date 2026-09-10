package practice2;

public class Voting {

    int age;

    public Voting(int age){
        this.age = age;
    }

    public void check() throws VotingException{

        if(age<10){
            throw new VotingException();
        }
        else System.out.println("You are eligible for voting.");
    }

    public static void main(String[] args) throws VotingException {
        Voting v = new Voting(55);
        v.check();
    }
}
