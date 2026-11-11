package OOPS;

//Super Keyword - Whenever we want access old implementation along
//with new implementation we use super keyword

class Learning{
    public void course(){
        System.out.println("Only recorded Video");

    }
}
//class LearningV2{
  //  public void course(){
    //    System.out.println("also live session");
        
    //}
//}
class LearningV2 extends Learning{
    public void course(){
        super.course();
        System.out.println("also live session");
        
    }
}
public class OverridingExample2 {
    public static void main(String[] args) {
        LearningV2 v2=new LearningV2();
        v2.course();
        
    }


}
