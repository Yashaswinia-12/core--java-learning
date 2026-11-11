package inputOutput;
import java.util.*;

public class main {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("age is:"+age);

        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Sum of two numbers:"+(num1+num2));


    }

}
