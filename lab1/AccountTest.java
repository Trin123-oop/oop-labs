package lab1;

public class AccountTest
{
    public static void main(String[] args) {
        
        Account account1 = new Account("John", 1000);

        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        account1.setName("Michael");
        System.out.println("\nChanged name: " + account1.getName());

        account1.deposit(500);
        System.out.println("After depositing 500: " + account1.getBalance());

        account1.deposit(-200);
        System.out.println("After depositing -200: " + account1.getBalance());

        account1.deposit(0);
        System.out.println("After depositing 0: " + account1.getBalance());

        Account account2 = new Account("Jane", -500);
        System.out.println("\nAccount 2 name: " + account2.getName());
        System.out.println("Account 2 balance: " + account2.getBalance());

        Account account3 = new Account("Bob", 0);
        System.out.println("\nAccount 3 name: " + account3.getName());
        System.out.println("Account 3 balance: " + account3.getBalance());
    }
}