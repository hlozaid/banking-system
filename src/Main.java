class Bank {
    private String name;
    private int accountNumber;
    private double balance;
    private long phoneNumber;

    public Bank(String name, int accountNumber, double balance, long phoneNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds. Current balance: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + this.balance);
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Phone Number: " + this.phoneNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank("Mohd Zaid", 12345678, 1000.00, 9012528862L);

        System.out.println("Initial Balance: " + myBank.getBalance());

        myBank.deposit(500.00);
        myBank.withdraw(200.00);

        System.out.println("Final Balance: " + myBank.getBalance());


        myBank.printAccountInfo();
    }
}