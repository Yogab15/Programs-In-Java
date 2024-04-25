package MyGit; 
class BankAccount12 {
    protected double balance;

    public BankAccount12(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount1 extends BankAcc {
    private static final double WITHDRAWAL_LIMIT = 500;
	private static String accountNumber;

    public SavingsAccount1(double initialBalance)
    {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }

	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}

class CheckingAccount1 extends BankAcc {
    private static final double OVERDRAFT_FEE = 25;

    public CheckingAccount1(double initialBalance, String accountNumber) {
        super(accountNumber, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            balance -= OVERDRAFT_FEE;
            System.out.println("Withdrawn with overdraft fee: $" + (amount + OVERDRAFT_FEE));
        }
    }
}

public class BankAcc1 {
    public static void main(String[] args) {
        SavingsAccount1 savingsAccount = new SavingsAccount1(0);
        CheckingAcc1 checkingAccount = new CheckingAcc1(2000);

        savingsAccount.deposit(500);
        savingsAccount.withdraw(300);
        savingsAccount.withdraw(700);

        checkingAccount.deposit(1000);
        checkingAccount.withdraw(1500);
        checkingAccount.withdraw(500);
    }
}
