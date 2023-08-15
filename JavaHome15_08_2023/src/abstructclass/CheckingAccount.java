
package abstructclass;


public class CheckingAccount extends BankAccount{

    public CheckingAccount() {
    }

    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    

    
    
    
    @Override
    public void deposit(double amount) {
             if(amount>0){
          balance+=amount;
          System.out.println("The deposit is "+amount+" and Total amount is "+balance);
      }
      else{
          System.out.println("Enter Correct amount");
      }
    }

    @Override
    public void withdraw(double amount) {
        if(balance *1.05 <amount){
            System.out.println("Invalid Claim");
        }
//        else if(){
//            System.out.println(amount+" claim successfully");
//            System.out.println("The final balance is "+(balance-amount));
//        }
        
        else{
            System.out.println(amount+ " claim Succesfully");
            System.out.println("The final balance is "+(balance-amount));
            
        }
          
    }



    
     

    

    
}
