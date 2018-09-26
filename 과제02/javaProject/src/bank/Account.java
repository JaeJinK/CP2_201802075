package bank;
public class Account {
	private String name;
	private long balance;
	private long money;
	private double interestRate;

	public Account(String name, int balance, double interestRate) {
		this.name=name;
		this.balance=balance;
		this.interestRate=interestRate;	
	}
	public synchronized final String getName() {return name;}
	public synchronized final void setName(String name) {this.name = name;}
	public synchronized final long getBalance() {return balance;}
	public synchronized final void setBalance(int balance) {this.balance = balance;}
	
	public long deposit(long money) {
		balance+=money;
		return balance;
		}
	public long withdraw(long money) {
		balance-=money;
		if(balance<0)
			return -1;
		else
			return 0;
	}
	private long money1=balance;
	public long installmentSavingPredict(int month, long money) {
		money1=(long)(balance+(money*interestRate/12*(month*(month+1)/2)+money*month));
		return money1;	
	}
	public long flxedDepositPredict(int month, long money) {
		balance=(long) (money+(money*((Math.pow(1+(interestRate/12), month))-1)));
		return balance;
	}
}
