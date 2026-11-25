package collectionframework.list;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        
        System.out.println(list);

        List<Integer> list2=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
               list2.add(list.get(i));
               //System.out.println(list.get(i));
                
            }
        }
        System.out.println(list2);
        for(Integer integer: list2){
            System.out.println(integer);
        }

    }

}
