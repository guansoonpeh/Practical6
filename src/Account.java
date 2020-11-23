
import java.util.Date;


public class Account {
    private String accountNumber;
    private double balance;
    private Date dateCreated;

    public Account() {
        this("", 0.00);
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdrawal(double amount){
        if (balance - amount <= 10){
           throw new IllegalArgumentException("Invalid amount");
        }else{
           balance -= amount;
        }
    }
    
    public String toString(){
        return "Account Number : " + accountNumber + "\n" +
               "Balance : " + balance + "\n" + 
               "Date Created : " + dateCreated;
        
    }
    
    
}
