
public class CurrentAccount extends Account {

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

    public void increaseTransactionCount() {
        transactionCount++;
    }

    public void resetTransactionCount() {
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void withdrawal(double amount) {

        try {
            super.withdrawal(amount);
            increaseTransactionCount();
            if (getTransactionCount() > freeTansactions) {
                super.withdrawal(transactionCharge);
            }

        } catch (IllegalArgumentException ex) {
            
            throw ex;
        }
    }

    public void deposit(double amount) {

        super.deposit(amount);
        increaseTransactionCount();
        if (getTransactionCount() > freeTansactions) {
            super.withdrawal(transactionCharge);
        }
    }

    public String toString() {
        return super.toString() + "\n" +
                "Transaction Count : " + transactionCount;
    }

}
