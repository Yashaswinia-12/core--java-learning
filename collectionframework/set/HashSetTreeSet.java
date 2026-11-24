package collectionframework.set;
import java.util.*;

public class HashSetTreeSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(22);
        set.add(16);
        set.add(58);
        set.add(15);
        set.add(89);
        set.add(16);
        set.add(null);
        System.out.println(set);


        Set<Integer> set2=new TreeSet<>();
        set2.add(22);
        set2.add(16);
        set2.add(58);
        set2.add(15);
        set2.add(89);
        set2.add(16);
        
        System.out.println(set2);
    }

}
