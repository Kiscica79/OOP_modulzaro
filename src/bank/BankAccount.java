package bank;

public class BankAccount {

    private String accountName;
    private double balance;
    private final String accountNumber;

    public BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(accountName + " " + amount + " deposited. New balance: " + balance);
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountName + " " +amount + " withdrawn. New balance: " + balance);
        } else {
            throw new IllegalArgumentException("Insufficient balance.");
        }
    }

    public void transfer(BankAccount targetAccount, double amount) throws IllegalArgumentException {
        if (amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println(amount + " transferred to " + targetAccount.getAccountName());
        } else {
            throw new IllegalArgumentException("Insufficient balance for the transfer.");
        }
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public static boolean isValidAccountNumber(String accountNumber) {
        int sum = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            char character = accountNumber.charAt(i);
            if (Character.isDigit(character)) {
                sum += character;
            }
        }

        int firstDigit = Integer.parseInt(String.valueOf(accountNumber.charAt(0)));
        int lastDigit = Integer.parseInt(String.valueOf(accountNumber.charAt(accountNumber.length() - 1)));

        return sum >= 20 && firstDigit % 2 == lastDigit % 2;
    }

}


