package conditions;

public class Characters {
    
    public void add(){
        int a=10;
        int b=20;
        System.out.println("addition"+(a+b));

    }
    public void sub(){
        int a=30;
        int b=20;
        System.out.println("SUBTRACTION"+(a-b));
    }
    public static void main(String[] args){
        char a='a';
        char b='\u0065';
        System.out.println(a);
        System.out.println(b);

        Characters ref=new Characters();
        ref.add();
        ref.sub();
        System.out.println(2<<2);
        System.out.println(3<<3);
        System.out.println(10>>3);


        }
}
 