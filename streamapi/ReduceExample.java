package streamapi;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,3,6,1,4);
        Stream<Integer> stream=list.stream();

        BinaryOperator<Integer> binaryOperator=new BinaryOperator<>(){

            public Integer apply(Integer a, Integer b){
                return a+b;
            }



        };

        //BiFunction biFunction2=(a,b)->a+b;
       // int sum=stream.reduce(2,binaryOperator);
        //System.out.println(sum);
        BinaryOperator<Integer> binaryOperator2=(a,b)->a+b;
       // int sum=stream.reduce(0,binaryOperator2);
        int sum2=stream.reduce(0,(a,b)->a+b);
        System.out.println(sum2);

        Consumer<Integer> consumer=new Consumer<>(){
            public void accept(Integer a){
                System.out.println(a);

            }

        } ;
        list.forEach(consumer);

        Consumer<Integer> consumer2=(a)->System.out.println(a);

        list.forEach(consumer2);

        int sum3=list.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
        System.out.println(sum3);

    }

}