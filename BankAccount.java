public class BankAccount {  // Changed from 'Account' to 'BankAccount'
    private String owner;  
    private double balance;  

    // Constructor  
    public BankAccount(String owner, double initialBalance) {  
        this.owner = owner;  
        if (initialBalance >= 0) this.balance = initialBalance;  
    }  

    // Getter  
    public double getBalance() { return balance; }  

    // Setter (with validation)  
    public void withdraw(double amount) {  
        if (amount > 0 && amount <= balance) balance -= amount;  
    }  
}