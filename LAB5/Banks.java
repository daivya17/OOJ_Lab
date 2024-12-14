import java.util.Scanner;

class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

    public Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
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

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }

    public void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest of " + interest + " deposited. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}

class CurAcct extends Account {
    private static final double MINIMUM_BALANCE = 1000.0;
    private static final double PENALTY = 100.0;

    public CurAcct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);

            if (balance < MINIMUM_BALANCE) {
                balance -= PENALTY;
                System.out.println("Balance below minimum. Penalty of " + PENALTY + " imposed. Updated balance: " + balance);
            }
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}

public class Banks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Savings Account:");
        System.out.print("Customer Name: ");
        String savName = scanner.nextLine();
        System.out.print("Account Number: ");
        String savAccNo = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double savBalance = scanner.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = scanner.nextDouble();
        SavAcct savings = new SavAcct(savName, savAccNo, savBalance, interestRate);

        scanner.nextLine();
        System.out.println("\nEnter details for Current Account:");
        System.out.print("Customer Name: ");
        String curName = scanner.nextLine();
        System.out.print("Account Number: ");
        String curAccNo = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double curBalance = scanner.nextDouble();
        CurAcct current = new CurAcct(curName, curAccNo, curBalance);

        System.out.println("\nPerforming operations on Savings Account:");
        savings.deposit(1000);
        savings.computeAndDepositInterest();
        savings.withdraw(500);
        savings.displayBalance();

        System.out.println("\nPerforming operations on Current Account:");
        current.deposit(2000);
        current.withdraw(2500);
        current.withdraw(500);
        current.displayBalance();
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
        scanner.close();
    }
}
