package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks){
        super();
        this.id=id;
        this.name=name;
        this.marks=marks;

    }
     @Override
    public  int compareTo(Student o){
        return this.marks-o.marks;
    }
     @Override
     public String toString(){
        return "Student [id=" + id + ", name=" + name + ",marks=" + marks +"]";

    }
   
}
public class Comparabledemo {
    public static void main(String[] args) {
    ArrayList<Student> s=new ArrayList<Student>();

    s.add(new Student(102,"sushma",27));
    
    s.add(new Student(67,"rashmi",67));
    
    s.add(new Student(10,"asha",77));
    
    s.add(new Student(15,"ravi",97));

    Collections.sort(s);
    System.out.println("after sorting by marks:");
    for(Student g:s){
        System.out.println(g);
    }




        
    }

}
