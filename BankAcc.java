package MyGit; 
public class BankAcc {

	public String accountNumber;
	public double balance;
	
	public BankAcc(String accountNumber, double balance)
	{
		super();
		this.accountNumber= accountNumber;
		this.balance=balance;
	}
			
	public void withdraw(double amount)
	{
		if (balance >= amount)
		{
			balance -= amount;
			
		}
		else
		{
			System.out.println("INSUFFICIENT BALANCE.....!");
		}
	}
	public double getBalance()
	{
		return balance;
	}
}
