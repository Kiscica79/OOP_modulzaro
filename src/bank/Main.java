package bank;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {

        BankAccount account1 = new BankAccount("John Doe", 1000.0, "123456789");
        BankAccount account2 = new BankAccount("Jane Smith", 500.0, "987654321");

        account1.deposit(500.0);
        account2.withdraw(200.0);

        account1.transfer(account2, 300.0);

        String validAccountNumber = "123456789";
        String invalidAccountNumber = "9000000-00002";

        System.out.println(validAccountNumber + " valid? " + BankAccount.isValidAccountNumber(validAccountNumber));
        System.out.println(invalidAccountNumber + " valid? " + BankAccount.isValidAccountNumber(invalidAccountNumber));
    }

}

