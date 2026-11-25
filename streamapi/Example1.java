package streamapi;


import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;


public class Example1 {
      public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
        
        System.out.println(list);

     //   List<Integer> list2=new ArrayList<>();

     //   for(int i=0;i<list.size();i++){
      //      if(list.get(i)%2==0){
       //        list2.add(list.get(i));
               //System.out.println(list.get(i));
                
      //      }
      //  }
      //  System.out.println(list2);
      //  for(Integer integer: list2){
      //      System.out.println(integer);
       // }
       
         Stream<Integer> stream=list.stream();
         Predicate<Integer> predicate=new Predicate<Integer>(){
            public boolean test(Integer n){
               if(n%2==0){
                  return true;
               }
               else{
                  return false;
               }
            }
         };
        
         Predicate<Integer> predicate2=(Integer n)->{
            if(n%2==0){
                  return true;
               }
               
               return false;
            
            };
      

         Predicate<Integer> predicate3=(n)->n%2==0?true:false;
         List<Integer> list2=stream.filter(n->n%2==0?true:false).toList();
         System.out.println(list2);




    }

}


