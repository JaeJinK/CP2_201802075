package bank.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import bank.Account;

class AccountTest {
	@Test
	void testAccount() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals("梯營霞", account.getName());
	}
	@Test
	void testGetName() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals("梯營霞", account.getName());
	}
	@Test
	void testGetBalance() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals(300000, account.getBalance());
	}
	@Test
	void testDeposit() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals(400000, account.deposit(100000));
	}
	@Test
	void testWithdraw() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals(0, account.withdraw(200000));
	}
	@Test
	void testInstallmentSavingPredict() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals(account.installmentSavingPredict(12, 10000), account.installmentSavingPredict(12, 10000));}
	@Test
	void testFlxedDepositPredict() {
		Account account=new Account("梯營霞", 300000, 0.1);
		assertEquals(2440781, account.flxedDepositPredict(24, 2000000));
	}
}
