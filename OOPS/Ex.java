package OOPS;

class Payment{
    void pay(){
        System.out.println("Pay amount");
    }
}

class PhonePay extends Payment{
    void pay(int amount){
        System.out.println("paid by phonepay"+amount);
    }

}
class GPay extends Payment{
    void pay(int amount){
        System.out.println(amount+"paid by gpay");
    }

}
class CreditCard extends Payment{
    void pay(int amount){
        System.out.println(amount+"paid by creditcard");
    

    }
}
public class Ex {
    public static void main(String[] args) {
        Payment payment=new PhonePay();
           
    }
}

