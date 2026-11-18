package exceptionHandling.creatingexception.banksystem;

public class Main {
    public static void main(String[] args) {
        SavingAccount sv=new SavingAccount();
        sv.getBal();
        try {
            sv.withdraw(2000);
            
        } catch (BankException e) {
            System.out.println(e.getMessage());
            sv.getBal();
        }
    }

}
