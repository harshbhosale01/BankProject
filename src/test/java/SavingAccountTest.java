import org.example.SavingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {
    @Test
    public void testWithdraw() {
        System.out.println("testing Withdraw");
        double openingBalance=4000;
        double amountToWithdraw=1000;
        SavingAccount acc2 = new SavingAccount(openingBalance);
        Assertions.assertTrue(acc2!=null);
        System.out.println("Object creation testcase passed...");
        acc2.withdraw(amountToWithdraw);
        double expectedBalance=openingBalance-amountToWithdraw;
        Assertions.assertEquals(expectedBalance, acc2.displayBalance());
        System.out.println("Withdraw testcase passed...");
        ///acc2.displayBalance();
        System.out.println("tested Withdraw");

    }
}
