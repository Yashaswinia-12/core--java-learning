package streamapi;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class MapExample {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);

        Stream<Integer> square=list.stream();
        Function<Integer,Integer> function=new Function<>(){
            public Integer apply(Integer a){
                return a+2;
            }

        };

         Function<Integer,Integer> function2=(a)->a+2;
         
        square.map((a)->a+2).forEach(n->System.out.println(n));



    }

}
