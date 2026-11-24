package collectionframework.set;
import java.util.*;

class Employee implements Comparable <Employee>{
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override 
    public int compareTo(Employee a){
        if(this.name.length()>a.name.length()){
            return 1;
        }
        return -1;

    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }


   
}


public class Example2 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"yashu",22));
        list.add(new Employee(2,"ravi",20));
        list.add(new Employee(3,"abc",45));
        list.add(new Employee(4,"c",4));

        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(1);

        //Collections.sort(list);
       // System.out.println(list);

        //for(Employee val: list){
           // System.out.println(val);
        //}

        Comparator<Employee> com=(a,b)->{
            if(a.age>b.age){
                return 1;
            }
            return -1;
        };
        Collections.sort(list,com);
        System.out.println(list);


    }


}
