package OOPS.encapsulation;

public class Bank {
    private int balance=2000;

    public int getBalance(){
        return balance;

    }

    public void withdraw(int amount){
        System.out.println(amount+ "amount is withdrawed successfully");
        balance=balance-amount;
    }
    public void deposit(int amount){
        System.out.println(amount+ "amount is credited ");
        balance=balance+amount;
    
    }
}
