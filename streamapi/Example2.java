package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Example2 {
    public static void main(String[] args) {
      
        




        int size=100;
        List<Integer> list=new ArrayList<>();
        Random random=new Random();

        for (int i=0;i<size;i++){
            list.add(random.nextInt(100));



        }
        System.out.println(list);

        long startStream=System.currentTimeMillis();
        int sum=list.stream().
        map(n->{
            try{
                Thread.sleep(10);
            }
            catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).sum();

        int sum2=list.stream().filter(n->n%2==0).map(n->n*2).mapToInt(n->n).sum();
        System.out.println("normal stream"+sum2);
        long endStream=System.currentTimeMillis();


        long startPar=System.currentTimeMillis();
        int sum3=list.parallelStream().
        map(n->{
            try{
                Thread.sleep(10);
            }
            catch(Exception e){

            }
            return n*2;
        }).mapToInt(n->n).sum();
        int sum4=list.parallelStream().filter(n->n%2==0).map(n->n*2).mapToInt(n->n).sum();
        System.out.println("parallel stream"+sum4);
        long endPar=System.currentTimeMillis();

        System.out.println("Normal stream"+(endStream-startStream));
        System.out.println("Parallel stream"+(endPar-startPar));






    }

}
