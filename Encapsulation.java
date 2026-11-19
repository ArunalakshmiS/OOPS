class Account {
    private double balance;
    void deposit(double amount){if(amount>0)balance+=amount;}
    double getBalance(){return balance;}
}
public class Encapsulation {
    public static void main(String[] args){Account a=new Account();a.deposit(5000);System.out.println(a.getBalance());}
}
