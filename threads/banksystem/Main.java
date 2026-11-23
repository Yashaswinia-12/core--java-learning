package threads.banksystem;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank=new Bank();
        PhonePay pay=new PhonePay(bank,"withdraw",500);
        PhonePay pay2=new PhonePay(bank,"deposite",5000);
      
        ATM atm=new ATM(bank, "withdraw", 1000);
        Bank bank2=new Bank();

        

        pay.join(100);
        pay.start();
        pay2.join(100);
        pay2.start();
        atm.join(100);
        atm.start();

        Thread.sleep(1000);
        bank.getBal();
        

    }
}