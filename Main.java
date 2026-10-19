import java.util.Scanner;

public class Main{
    

    static  double  deposit(double amount, double bank_balance){
        System.out.println("Transaction Type: Deposit");

        if (amount <= 0){
            System.out.println("Invalid deposit amount. Deposit must be greater than zero");
            return bank_balance;
        }

        bank_balance += amount;
        System.out.println("Deposit successful. New balance is: KSh " + bank_balance);
        return bank_balance;

    }

    static double withdrawal(double amount, double bank_balance){      
        System.out.println("Transaction Type: Withdrawal");

        if (amount <= 0){
            System.out.println("Invalid withdrawal amount. Withdrawal must be greater than zero");
        }
        else if (amount > bank_balance){
            System.out.println("Insufficient funds. Transaction failed");
        }
        else{
            bank_balance -= amount;
            System.out.println("Withdrawal successful. New balance is: " + bank_balance);
             
        }
        return bank_balance;
    }

    public static void main(String[] args) {
        
        double bank_balance = 500.00;
        Scanner choices = new Scanner(System.in);

        System.out.println("Hello customer!");
        System.out.println("Choose A for deposit, B to withdraw, or AB for both.");
        System.out.println("Type bal to check your balance.");

        String choice = choices.nextLine().trim();

        if (choice.equalsIgnoreCase("a")){
            bank_balance = deposit(500, bank_balance);
        }   
        else if(choice.equalsIgnoreCase("b")){
            bank_balance = withdrawal(200, bank_balance);
        }
        else if(choice.equalsIgnoreCase("ab")){
            bank_balance = deposit(500, bank_balance);
            bank_balance = withdrawal(200, bank_balance);
        }
        else if(choice.equalsIgnoreCase("bal")){
            System.out.println("Your Account Balance is: "+bank_balance);
        }
        else{
            System.out.print("invalid chaice !");
        }

        System.out.println("Final balance: KSh "+bank_balance);
        choices.close();
    }
}