class Account {
    protected String customerName;
    protected String accountNumber;
    protected double balance;

    public Account(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private final double interestRate; // Annual interest rate

    public SavingsAccount(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest(int years) {
        double interest = balance * Math.pow(1 + interestRate / 100, years) - balance;
        balance += interest;
        System.out.println("Interest deposited for " + years + " years. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class CurrentAccount extends Account {
    private final double minimumBalance;
    private final double serviceCharge;

    public CurrentAccount(String customerName, String accountNumber, double initialBalance, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, initialBalance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            if (balance < minimumBalance) {
                balance -= serviceCharge;
                System.out.println("Minimum balance not maintained. Service charge imposed.");
            }
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Alice", "SA12345", 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount("Bob", "CA12345", 2000, 1000, 50);

        System.out.println("Savings Account:");
        savingsAccount.deposit(500);
        savingsAccount.displayBalance();
        savingsAccount.computeAndDepositInterest(2);
        savingsAccount.withdraw(300);
        savingsAccount.displayBalance();

        System.out.println("\nCurrent Account:");
        currentAccount.deposit(1000);
        currentAccount.displayBalance();
        currentAccount.withdraw(1500);
        currentAccount.displayBalance();
        currentAccount.withdraw(1000);  // This withdrawal will impose a service charge if minimum balance is not maintained
        currentAccount.displayBalance();
    }
}
