package Day4_assignement;

interface BankInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class Account implements BankInterface {
 protected double balance;
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }
 public double getBalance() {
     return balance;
 }
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance.");
     }
 }
}
class SavingsAccount extends Account {
 private final double minimumBalance = 500;
 public void withdraw(double amount) {
     if ((balance - amount) >= minimumBalance) {
         balance -= amount;
         System.out.println("Withdrawn from SavingsAccount: " + amount);
     } else {
         System.out.println("Cannot withdraw. Minimum balance of " + minimumBalance + " must be maintained.");
     }
 }
}
class CurrentAccount extends Account {
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from CurrentAccount: " + amount);
     } else {
         System.out.println("Insufficient funds in CurrentAccount.");
     }
 }
}
public class Bank_main {
 public static void main(String[] args) {
	 BankInterface savings = new SavingsAccount();
     savings.deposit(1000);
     savings.withdraw(400);  
     savings.withdraw(200);  
     System.out.println("Savings Balance: " + savings.getBalance());
     System.out.println();
     BankInterface current = new CurrentAccount();
     current.deposit(1000);
     current.withdraw(1100); 
     current.withdraw(700); 
     System.out.println("Current Balance: " + current.getBalance());
 }
}