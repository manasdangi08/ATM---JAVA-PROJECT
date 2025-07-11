
 public class BankAccount {
    private int accountNumber;
    private int pin;
    private double balance = 5000;

    BankAccount(int accountNumber,int pin,double balance){
        this.accountNumber=accountNumber;
        this.pin = pin;
        this.balance = balance;
    }
     double getBalance(){
        return balance;
     }
     void deposit(double amount){
        balance = balance + amount;
     }
     void withdraw(double amount){
        if(balance>=amount){
            balance = balance + amount;
        }else{
            System.out.println("Insufficiant balance");
        }
     }
      int getAccountNumber() {
         return accountNumber;
     }
      int getPin() {
         return pin;
     }
      }

