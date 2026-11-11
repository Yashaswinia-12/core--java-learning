package staticandnonstatic;

public class StaticNonStaticAccess {

    int a=10;
    static int b=6;

    public static void add(){
        System.out.println(b);

    }

    public void sum(){
        System.out.println(a);
        System.out.println(b);System.out.println(b);
    }
    public static void main(String[] args) {
        add();

        new StaticNonStaticAccess().sum();
        
    }

}
                                                                                                                                                             