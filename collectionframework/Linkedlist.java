package collectionframework;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> p=new LinkedList<Integer>();
        p.add(3);
        p.add(2);
        p.add(9);

        p.addFirst(6);

        p.addLast(78);
        p.addLast(88);

        System.out.println("number:"+p);
        System.out.println("after removing first" +p.removeFirst());
        System.out.println(p);

    }

}
