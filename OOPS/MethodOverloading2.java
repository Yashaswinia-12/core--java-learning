package OOPS;

class markscalculation{
    public static void add(double marks) {
        System.out.println("Marks of one subject:"+(marks));
            
    }
    public static void add(double marks1,double marks2) {
        System.out.println("Marks of 2 subject:"+(marks1+marks2)/2);
            
    }
    public static void add(double marks1,double marks2,double marks) {
        System.out.println("Marks of 3 subject:"+(marks1+marks2+marks)/3);
            
    }
}

public class MethodOverloading2 {
    
    public static void main(String[] args) {
        markscalculation marks=new markscalculation();
        markscalculation.add(21);
        markscalculation.add(67,90);

        
    }

}
