package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodRefExample {
    public static void main(String[] args){
       List<String> names=Arrays.asList("Raju","John","Peter","Jack","Ravi");
        Optional<String> n_ames=names.stream().filter(str->str.contains("Ram")).findFirst();
        System.out.println(n_ames);

        String n_ames2=names.stream().filter(str->str.contains("Ram")).findFirst().orElse("novalue");
        System.out.println(n_ames2);

        Optional<String> n_ames3=names.stream().filter(str->str.contains("Ram")).findFirst();
        System.out.println(n_ames3.orElse("No value present"));

        String n_ames4=names.stream().filter(str->str.contains("Ram")).findFirst().orElse("no value");
        System.out.println(n_ames4);

        List <String> n_ames5=names.stream().map(str->str.toUpperCase()).toList();
        System.out.println(n_ames5);

        List <String> n_ames6=names.stream().map(String::toLowerCase).toList();
        System.out.println(n_ames6);

    }
}
