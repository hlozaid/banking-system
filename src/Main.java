class BankAccountInfo {
    private String name;
    private int accountNumber;
    private double balance;
    private long phoneNumber;

    String getName() {
        return name;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    long getPhoneNumber() {
        return phoneNumber;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public BankAccountInfo(String name, int accountNumber, double balance, long phoneNumber) {
        this.setName(name);
        this.accountNumber = accountNumber;
        this.setBalance(balance);
        this.phoneNumber = phoneNumber;
    }

    public void checkBalance() {
        System.out.println("Your Current Balance is: " + getBalance());
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to " + this.getName());
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawn " + amount + ", remaining balance: " + this.balance);
        }
    }

    public void printAccountInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Account Number: " + this.getAccountNumber());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Phone Number: " + this.getPhoneNumber());
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccountInfo myBank = new BankAccountInfo("Mohd Zaid", 12345678, 1000.0, 9012528862L);

        System.out.println("Initial balance: " + myBank.getBalance());
        myBank.deposit(500);
        myBank.withdraw(300);
        myBank.checkBalance();
        System.out.println("<---------------------------------------------->");
        myBank.printAccountInfo();
    }
}
