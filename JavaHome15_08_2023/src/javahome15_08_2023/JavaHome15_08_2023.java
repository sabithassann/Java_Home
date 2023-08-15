
package javahome15_08_2023;

import abstructclass.BankAccount;
import abstructclass.CheckingAccount;
import abstructclass.SavingAccount;


public class JavaHome15_08_2023 {


    public static void main(String[] args) {
        
        BankAccount savingAccount=new SavingAccount("SA-007", "Sabit", 50.0);
        BankAccount checkingAccount=new CheckingAccount("SA-008", "Nahid", 50);
        //BankAccount savingAccount=new SavingAccount("SA-007", "Sabit", 1500.0);
       //BankAccount checkingAccount=new CheckingAccount();
        System.out.println("Account holder name: "+savingAccount.getAccountHolder());
        savingAccount.deposit(50.0);
        //savingAccount.withdraw(106.0);
        System.out.println("");
        System.out.println("Acount holder name: "+checkingAccount.getAccountHolder());
        checkingAccount.deposit(100.0);
        checkingAccount.withdraw(152.0);
        
        //System.out.println("After Claim Balance "+savingAccount.getBalance()-savingAccount.withdraw(0));
        
       

    }
    
}
