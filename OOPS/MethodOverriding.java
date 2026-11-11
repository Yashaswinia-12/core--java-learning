package OOPS;
//runtime polymorphism-method decl get binded to its def at runtime by the jvm
//dynamic polymorphism- once its binded it can be rebinded
//late binding- beacause it's executing at the runtime

class Whatsapp{
    public void status(){
        System.out.println("Seeing status");
    }
} 
//class Whatsapp2{
   // public void status(){
      //  System.out.println("we can do audio and video call");

   // }
   // public void msg(){
    //    System.out.println("we can text and share audios,videos and images");                                                                                                     
    //}
//}
class Whatsapp2 extends Whatsapp{
    public void status(){
        System.out.println("Seeing status and reacting");


        }

}

public class MethodOverriding {
    public static void main(String[] args) {
        Whatsapp whatsapp=new Whatsapp();
        whatsapp.status();

        Whatsapp2 whatsapp2=new Whatsapp2();
        whatsapp2.status();
 
    }

}

