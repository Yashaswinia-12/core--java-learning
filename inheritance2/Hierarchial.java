package inheritance2;

class Employee{
    int id;
    String name;
    int sal;

    void dispDetails(){
        System.out.println("shoe details:");
    }
    void calSal(){
        System.out.println("calculate the salary");
    }
}
class Dev extends Employee{
    String lang="Java";
    void dispDetails(){
        System.out.println("Java Developer");
    }
}
class Testing extends Employee{
    String lang="Java sal";
    void dispDetails(){
        System.out.println("Testing team");
    }
}
    

public class Hierarchial {
    public static void main(String[] args) {
        Dev dev=new Dev();
        System.out.println(dev.lang);
        dev.dispDetails();

        Testing testing=new Testing();

        System.out.println(testing.lang);
        testing.dispDetails();
    }

}
