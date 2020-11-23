
public class SavingAccount extends Account {

    private static double interestRate = 0.03;

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
           
    public double calculateInterest(){
        return super.getBalance() * interestRate / 12;
    }
    
    public void addInterest(){
        double interest =  calculateInterest(); 
        
        super.deposit(interest);
    }
    
    
    public String toString(){
        return super.toString() + "\n" +
               "Interest Rate : " + interestRate; 
    }
}
