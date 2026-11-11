package games;
import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Random number Game");
        Random random=new Random();
        int sysInput=random.nextInt(101);
        int attempt=0;
        boolean isGameOver=false;

        Scanner sc=new Scanner(System.in);

        while(!isGameOver){
            System.out.println("Choose number between 0 to 10");
            int userInput=sc.nextInt();

            if(sysInput==userInput){
                System.out.println("Game is over");
                attempt++;
                isGameOver=true;
                System.out.println("User input:"+userInput);
                System.out.println("System input:"+sysInput);
                System.out.println("Attempts:"+attempt);

            }
            else if(userInput>10 || userInput<0){
                System.out.println("Please choose the correct number");
                userInput=sc.nextInt();
                attempt++;
            }
            else{
                attempt++;
            
            System.out.println("Number is not matched with the system number");

            }
        }

    }

        




}
