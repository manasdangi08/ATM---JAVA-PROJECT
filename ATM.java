import java.util.*;
import java.util.concurrent.TimeUnit;
public class ATM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int delay = 2;
        BankAccount ba = new BankAccount(1, 2, 5000);
        System.out.print("Enter your Account Number : ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter your pin : ");
        int pin = sc.nextInt();
        if(accountNumber==pin){
            System.out.println("Welcome to Atm Machine!!");
            System.out.println("How can I help you");
        
        
        System.err.println("1.Check Balance");
        System.err.println("2.Deposit");
        System.err.println("3.Withdrawl");
        System.err.println("4.Exit");
        System.err.print("Choice a Option : ");
        int Choice = sc.nextInt();
        switch (Choice) {
            case 1 :
                System.out.println("Your Balance is : "+ba.getBalance());
                break;
            case 2 :
                System.out.print("Enter The Amount You Want to Deposit : "); 
                double dp = sc.nextInt();
                System.out.println("Processing...");
                try {
                    TimeUnit.SECONDS.sleep(delay);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
                System.out.println("Done!...");
                
                System.out.println("Rs "+dp+" is sucessfully Credited in your Account Number "+accountNumber);
                break;
            case 3 :
                System.out.print("Enter The Amount You Want to Withdraw : ");
                double with = sc.nextInt();
                    if(with<=ba.getBalance()){
                    System.out.println("Processing...");
                    try {
                     TimeUnit.SECONDS.sleep(delay);
                        
                    } catch (Exception e) {
                      System.out.println(e);
                    }
                     System.out.println("Done!...");
                        System.out.println("Rs "+ with +" is sucessfully debited from your Account Number "+accountNumber);
                    }else{
                        try {
                            TimeUnit.SECONDS.sleep(delay);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        System.out.println("Insufficiant Balance");
                    }
                break;
            case 4 :
                System.out.println("Thank you for using the ATM!!");
                break;
            default:
                System.out.println("Invalid Choice. Try again ");
                break;
        }
    }else {
            System.out.println("Invalid Pin! Access Denied");
            System.out.println("Please Entered a Valid Pin");
        }
        sc.close();
        

        
    }
    
}
