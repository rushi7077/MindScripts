package practice2;

public class BankAccount {

    static int balance ;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int withdraw) throws Exception{

        if(withdraw>balance){

            throw new Exception("Exception occured : Insufficient fund.");

        }
        else {
            System.out.println("Your balance was : "+balance);
            System.out.println("You withdraw : "+withdraw);
            System.out.println("Remaining balance is : " +(balance-withdraw));
        }

    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount(10000);
        try {
            b.withdraw(55000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


