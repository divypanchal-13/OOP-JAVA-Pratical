/*
Create a class Account. It has three data member account id, name and balance. Define function to assign value and display value. Define function that search account number given by the user. If account number exists, print detail of that account. Write a program using array of object. Declare at least 5 account and print details.
*/

public class Pratical_3_7 {
    public static void main(String[] args) {

        Account[] accounts = new Account[5];
  
        accounts[0] = new Account(5861, "Divy Panchal",    10800.60);
        accounts[1] = new Account(6454, "Darshit Panchal", 20500.50);
        accounts[2] = new Account(9012, "Sarthak",         8900.75);
        accounts[3] = new Account(9831, "Kirtan Rathod",   10500.25);
        accounts[4] = new Account(7890, "Yatin Patel",     30209.10);
  
        System.out.println("Account Details:");
        for (Account account : accounts) {
          account.displayValue();
        }
  
        int searchId = 7890;
        System.out.println("\nSearching for account ID: " + searchId);
        Account.searchAccountNumber(accounts, searchId);
      }
}
class Account {
    private int accountId;
    private String name;
    private double balance;
  
    public Account(int accountId, String name, double balance) {
      this.accountId = accountId;
      this.name = name;
      this.balance = balance;
    }

    public void assignValue(int accountId, String name, double balance) {
      this.accountId = accountId;
      this.name = name;
      this.balance = balance;
    }

    public void displayValue() {
      System.out.printf("Account ID: %d, Name: %s, Balance: $%.2f\n", accountId, name, balance);
    }

    public static boolean searchAccountNumber(Account[] accounts, int searchId) {
      for (Account account : accounts) {
        if (account.accountId == searchId) {
          account.displayValue();
          return true; 
        }
      }
      System.out.println("Account not found.");
      return false; 
    }
}

  
  



  