package threads.threadexample1;

class A extends Thread{
    public void run(){
    
        for(int i=1;i<=10;i++){

           
                System.out.println(Thread.currentThread().getName());

            
            
           
    }
}
}
class B extends Thread{
    public void run(){
        
        for(int i=11;i<=20;i++){
             
                System.out.println(Thread.currentThread().getName());

            
           
    }
}
}
class C extends Thread{
    public void run(){
        
        for(int i=21;i<=50;i++){
             
                System.out.println(Thread.currentThread().getName());

            
            
           
    }
}
}

public class Main {
    public static void main(String[] args){
        A a=new A();
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        B b=new B();
        b.setPriority(Thread.MIN_PRIORITY);
        b.start();
        C c=new C();
        c.setPriority(Thread.MAX_PRIORITY);
        c.start();

        try{
            c.start();
            c.join();
            a.start();
            a.join();
            b.start();
            b.join();
        }
        catch(InterruptedException e){
            System.out.println("Handle");
        }

    }

}
