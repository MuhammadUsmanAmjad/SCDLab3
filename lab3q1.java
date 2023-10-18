import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(int accountNumber, double Balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        if (Balance < 0) {
            this.balance = 0;
            System.out.println("Balance cannot be negative");
        } else {
            this.balance = Balance;
        }
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount && amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient Balance or Negetive Withdraw Amount");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}

public class lab3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();
        System.out.println("Enter Account Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(accountNumber, balance, accountHolderName);
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
        System.out.println("Enter amount to withdraw: ");
        amount = sc.nextDouble();
        account.withdraw(amount);
        account.displayDetails();
    }

}