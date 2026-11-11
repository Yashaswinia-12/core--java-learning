package loops;

public class palindrome {
    public static void main(String[] args) {
        int num=131;
        int temp=num;
        int sum=0;
        
        
        while (temp!=0) { 
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
    
        }     
        if(sum==num){
            System.out.println("it is a palindrome");
        }   
        else{

        
            System.out.println("it is not a palindrome");
        }


    }

}
