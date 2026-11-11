package games;
import java.util.*;

public class Rock_Paper_Scissor_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter the below option");
        System.out.println("0. for Rock 1. for Paper 2. for Scissor");
        int userInput=sc.nextInt();

        Random random=new Random();
        int sysInput=random.nextInt(3);

        if(userInput==sysInput){
            System.out.println("Draw");
        }
        else if((userInput==0 && sysInput==2) || (userInput==2 && sysInput==1) || (userInput==1 && sysInput==0)){
            System.out.println("You win");
        }
        else{
            System.out.println("You loose");
        }
        System.out.println("UserInput:"+userInput);
        System.out.println("SystemInput:"+sysInput);
        
    }

}
