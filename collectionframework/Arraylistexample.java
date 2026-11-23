package collectionframework;
import java.util.ArrayList;

public class Arraylistexample {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<String>();
       
        s.add("ravi");
        s.add("priya");
        s.add("kiran");
        s.add("sneha");
        s.add("arun");

        System.out.println("students:"+s);

        System.out.println(s.get(1));

        s.set(3,"rohan");
        System.out.println("after updating:" +s);

        s.remove("Ravi");
        System.out.println(s);

        System.out.println(s.size());
        

    }

}
