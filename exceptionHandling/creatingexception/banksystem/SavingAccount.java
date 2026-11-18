package exceptionHandling.creatingexception.banksystem;

public class SavingAccount {
    int balance=1000;

    void withdraw(int amount)throws BankException{
        if(amount>balance){
            throw new BankException("Insufficient amount");
            //System.out.println("Insufficient amount");
        
        }
         System.out.println(amount+ "debited from your account");
         balance-=amount;

    }
    void deposit(int amount){
        System.out.println(amount+ "credited to ur account");
        balance+=amount;
    }
    void getBal(){
        System.out.println("Balance="+balance);
    }

}
