import java.util.Scanner;

public class ClientProgram {
    
    static Scanner scan = new Scanner(System.in);
    
    public static int menu(){
        
        System.out.println("\n1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Transaction Count");
        System.out.println("4. Account Detail");
        System.out.println("5. Exit");
        System.out.print("Enter Selection: ");
        int selection = scan.nextInt();
        
        return selection;
    }
    
    
    public static void main(String[] args) {
    
       CurrentAccount acc = new CurrentAccount("W111", 2000);
        double amount;
        
       int selection = 4;
       do{
           selection = menu();
           switch(selection){
               case 1:
                   System.out.print("Enter Amount : ");
                   amount  = scan.nextDouble();
                   acc.deposit(amount);     
                   acc.increaseTransactionCount();
                   
                   if (acc.getTransactionCount() > CurrentAccount.getFreeTansactions()){
                        acc.withdrawal(CurrentAccount.getTransactCharge());
                        System.out.println("Transaction Charge : " + CurrentAccount.getTransactCharge());
                   }
                     
                   break;
               case 2:
                   System.out.print("Enter Amount : ");
                   amount  = scan.nextDouble();
                   acc.withdrawal(amount);
                   acc.increaseTransactionCount();
                   
                   if (acc.getTransactionCount() > CurrentAccount.getFreeTansactions()){
                       acc.withdrawal(CurrentAccount.getTransactCharge());
                       System.out.println("Transaction Charge : " + CurrentAccount.getTransactCharge());
                   }
                   
                   break;
               case 3:
                   System.out.println("Transaction Count : " + acc.getTransactionCount());
                   
                   break;
               case 4:
                   System.out.println(acc.toString());
                   break;
                   
           }
         
       }while (selection != 5);

    }
}
