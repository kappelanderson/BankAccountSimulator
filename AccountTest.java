import java.util.Scanner;

public class AccountTest
{
public static void main(String[] args)
{ 
// New Objects accounts
Account account1 = new Account("Jane Green", 50.00);
Account account2 = new Account("John Blue", -7.53);

// Show the Object balances
System.out.printf("%s balance: $%.2f %n",
account1.getName(),account1.getBalance());
System.out.printf("%s balance: $%.2f %n%n",
account2.getName(),account2.getBalance());

// New object scanner
Scanner input = new Scanner(System.in);


// Deposit in Account 1
System.out.print("Enter deposit amount for account1: ");
double depositAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account1 balance%n%n",depositAmount);
account1.deposit(depositAmount);

// Show the balance both accounts
System.out.printf("%s balance: $%.2f %n",
account1.getName(),account1.getBalance()); 
System.out.printf("%s balance: $%.2f %n%n",
account2.getName(),account2.getBalance()); 

// Deposit in Account 2
System.out.print("Enter deposit amount for account2: ");
depositAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
account2.deposit(depositAmount);

// Show balance both accounts
System.out.printf("%s balance: $%.2f %n",
account1.getName(),account1.getBalance()); 
System.out.printf("%s balance: $%.2f %n%n",
account2.getName(),account2.getBalance()); 




// Withdraw in Account 1
System.out.print("Enter withdraw amount for account1: ");
double withdrawAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account1 balance%n%n",withdrawAmount);
account1.withdraw(withdrawAmount);

// Show both balances
System.out.printf("%s balance: $%.2f %n",
account1.getName(),account1.getBalance()); 
System.out.printf("%s balance: $%.2f %n%n",
account2.getName(),account2.getBalance()); 

// Withdraw account2
System.out.print("Enter withdraw amount for account2: ");
withdrawAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account2 balance%n%n",withdrawAmount);
account2.withdraw(withdrawAmount);

//Show both balances 
System.out.printf("%s balance: $%.2f %n",
account1.getName(),account1.getBalance()); 
System.out.printf("%s balance: $%.2f %n%n",
account2.getName(),account2.getBalance()); 


}
}