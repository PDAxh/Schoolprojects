public class BankAccount {


    private int balance;

    // no constructor this time, ignoring it atm

    // two methods

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }
}
