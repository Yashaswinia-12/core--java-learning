package streamapi;
import java.util.*;

class Employee{
    int id;
    String name;
    
    Employee(String name){
        
        this.name=name;
        
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

    
}


public class ConstructorRefExample {
    public static void main(String[] args){
        List<Employee> empList=new ArrayList<>();
        List<String> names=Arrays.asList("Raju","John","Peter","Jack","Ravi");

        for(String name:  names){
            empList.add(new Employee(name));
        }
        System.out.println(empList);

        List<Employee> empList2=new ArrayList<>();

        System.out.println("Try with stream Map()");

        empList2=names.stream().map(name->new Employee(name)).toList();
        System.out.println(empList2);

        System.out.println("Constructore Ref");
        List<Employee> empList3=new ArrayList<>();
        empList3=names.stream().map(Employee::new).toList();
        System.out.println(empList3);
    }
}
