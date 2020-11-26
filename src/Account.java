
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
        if(amount <=0){
             throw new IllegalArgumentException("Invalid amount");
        }else{
            balance += amount;
        }
        
    }
    
    public void withdrawal(double amount){
        if (balance - amount <= 10){
           throw new IllegalArgumentException("Invalid amount");
        }else{
           balance -= amount;
        }
    }
    
    public boolean equals(Object obj) {
           
        if (obj instanceof Account){
            Account acc = (Account) obj;
            
            return(this.accountNumber == acc.accountNumber);
        }else{
            return false;
        }
        
    }
    
    public String toString(){
        return "Account Number : " + accountNumber + "\n" +
               "Balance : " + balance + "\n" + 
               "Date Created : " + dateCreated;
        
    }
    
    
}
