package OOPS.abstraction.abstractKeyword.typecasting;

class A{
    void disp(){
        System.out.println("hello");
    }
}

class B extends A{
    void show(){
        System.out.println("bye");
    }
}
public class Main {
    public static void main(String[] args){
        B b=new B();
        A a=new B();
        a.disp();

        A a2=new A();
        B b2=(B) a2;
        b2.show();
        b2.disp();

    }

}
