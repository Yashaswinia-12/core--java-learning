package threads.banksystem;

public class ATM extends Thread {
    Bank bank;
    String op;
    int amount;
    ATM(Bank bank,String op,int amount){
        this.bank=bank;
        this.op=op;
        this.amount=amount;
    }

    public void disp(){
        if(op=="withdraw"){
            try{
            bank.withdraw(amount);
            
            }
            catch(BankException e){
                System.out.println(e.getMessage());
            }
            }
        
        else if(op=="deposite"){
            bank.deposite(amount);
            
        }
        else if(op=="balance"){
            bank.getBal();
        }
        else{
            System.out.println("wrong option");
        }

        
    }
    public void run(){
            disp();
    }
}