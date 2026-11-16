package OOPS.abstraction;

abstract class Employee{
    void disp(){
        System.out.println("show details");
    }

    abstract void show();
}

class A extends Employee{
    void show(){
         System.out.println("display details");

    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp=new A();  
        emp.show();
        emp.disp();
        
    }

}
