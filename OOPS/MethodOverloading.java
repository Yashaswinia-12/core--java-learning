package OOPS;

//method overloading
//compile time polymorphism
//static polymorphism
//early binding
class Calculator{
    public static void add(int a,int b) {
        System.out.println("sum of ="+(a+b));

    }
    public static void add(int a,int b,int c) {
        System.out.println("sum of ="+(a+b+c));
    }
    public static void add(int a,float b) {
        System.out.println("sum of ="+(a+b));
    }
}
public class MethodOverloading {
    //Method Overloading
    //Method overriding

    public static void main(String[] args) {
        Calculator add=new Calculator();
        Calculator.add(2,9);
        
    }

}      
 
 
 




