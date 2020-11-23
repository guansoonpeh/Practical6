
public class CurrentAccount extends Account{
    private static int freeTansactions = 3;
    private static double transactionCharge = 0.50;
    
    private int transactionCount;

    public CurrentAccount() {
    }

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public static int getFreeTansactions() {
        return freeTansactions;
    }

    public static double getTransactCharge() {
        return transactionCharge;
    }

    
    public void increaseTransactionCount(){
        transactionCount++;
    }
    
    public void resetTransactionCount(){
        transactionCount = 0;
    }
    
    public int getTransactionCount() {
        return transactionCount;
    }
           
    
    public String toString(){
        return super.toString() + "\n" +
               "Transaction Count : " + transactionCount;
    }
    
    
    
}
