import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void deposit() throws Exception {

        BankAccount account = new BankAccount();
        int amount = 500;
        account.deposit(amount);

        assertEquals(account.getBalance(), amount);
    }

    @Test
    public void withdraw() throws Exception {

        int amountToDeposit = 500;
        int amountToWithdraw = 200;
        BankAccount account = new BankAccount();

        account.deposit(amountToDeposit);
        account.withdraw(amountToWithdraw);

        assertEquals(300, account.getBalance() );
    }
    @Test
    public void withdrawTooMuch() throws Exception {

        int amountToDeposit = 500;
        int amountToWithdraw = 2000;
        BankAccount account = new BankAccount();

        account.deposit(amountToDeposit);
        account.withdraw(amountToWithdraw);

        assertEquals(0, account.getBalance());


    }

    @Test
    public void getBalance() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
    }
}