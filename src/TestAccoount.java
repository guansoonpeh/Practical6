
public class TestAccoount {

    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount("S123", 100);
        CurrentAccount ca = new CurrentAccount("C123", 1000);

        try {
            sa.withdrawal(200);
        } catch (IllegalArgumentException ex) {
            System.out.println("Amount too low");
        }

        System.out.println(sa.getBalance());
        // sa.deposit(100);
        //sa.addInterest();
        // System.out.println(sa.getBalance());

        // ca.withdrawal(500);
        // ca.increaseTransactionCount();
        //  System.out.println(ca.toString());
    }
}
