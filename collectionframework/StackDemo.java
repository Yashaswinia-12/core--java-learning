package collectionframework;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s);
        s.capacity();
        System.out.println(s);
        s.contains(9);
        System.out.println(s);

        
        s.pop();
        System.out.println(s);







    }

}
