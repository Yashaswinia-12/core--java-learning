package string;

public class StringExample {
    public static void main(String[] args) {
        String name="abc";
        System.out.println(name);

        String name2=new String("abc");
        System.out.println(name);

        String name3="abc";
        String name4=new String("abc");

        System.out.println(name==name3);
        System.out.println(name==name2);
        System.out.println(name3==name4);



    }

}
