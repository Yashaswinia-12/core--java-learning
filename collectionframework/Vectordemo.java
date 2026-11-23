package collectionframework;
import java.util.Vector;

public class Vectordemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(78);
        v.add(87);
        v.add(34);
        System.out.println(v);
        v.capacity();
        System.out.println(v);
        v.contains(2);
        System.out.println(v);
        v.removeFirst();
        System.out.println(v);
        for(int h:v){
            System.out.println(h);

        }
        v.clear();
        System.out.println(v);





        
    }

}
