package collectionframework.set;
import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("hello world");
        list.add(Integer.valueOf(22));
        list.add(true);
        list.add(8.98);
        list.add('Y');

        System.out.println(list);

        List<Integer> list2=Arrays.asList(12,23,45,34,24,56,78,90);
        System.out.println(list2);
       // Comparator<Integer> com=new Comparator<>() {
            //public int compare(Integer a, Integer b){
               // if(a%10<b%10){
                  //  return -1;
               // }
                //else if(a%10>b%10){
                   // return 1;
               // }
               // else{
                   // return 0;
              //  }
          //  }
      //  };

        Collections.sort(list2,(a2,b2)->a2%10>b2%10?-1:1);
        System.out.println("sorted with 2 digit"+list2);

        
    }

}
