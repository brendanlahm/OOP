import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestBankAccount {

    private static BankAccount account;
    private static final double INITIAL_BALANCE = 100.0;

    @BeforeAll
    static void SetUp() {
        account = new BankAccount(INITIAL_BALANCE);
    }

    @AfterEach
    void Reset() {
        account.setBalance(INITIAL_BALANCE);
    }

     @Test
     void testDeposit() {

         // Test deposit
         account.deposit(50.00);
         Assertions.assertEquals(150.00, account.getBalance(), 0.001);
         // Assertions.assertEquals(151.00, account.getBalance(), 0.001);); // Testing for a Test fail
         Assertions.assertNotEquals(151.00, account.getBalance(), 0.001);

     }

     @Test
     void testZeroDepositAmount() {
     }

     @Test
    void testDepositNegativeAmount() { account.deposit(-20.0); Assertions.assertEquals(INITIAL_BALANCE, account.getBalance(), 0.001); }

     @Test
    void testWithdraw() {

         // Test withdrawal
         account.withdraw(40.00);
         Assertions.assertEquals(60.00, account.getBalance(), 0.001);
         // Assertions.assertEquals(99.99, account.getBalance(), 0.001); // Testing for a Test fail
         Assertions.assertNotEquals(99.99, account.getBalance(), 0.001);

     }

     @Test
    void testWithrawalExceedsBalance() {

         // Test whether Withdrawal exceeds Balance
         account.withdraw(150.00);
         Assertions.assertEquals(100.00, account.getBalance(), 0.001);

     }

     @Test
    void testWithdrawNegativeAmount() {}

    @Test
    void TestWithdrawZeroAmount() {}

}
