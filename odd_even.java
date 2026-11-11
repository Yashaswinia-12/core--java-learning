import java.util.*;
public class odd_even {
    public static void main(String[] args){
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        if (n%2==0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");


    }
}
