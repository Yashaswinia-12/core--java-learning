package inheritance2;

class Animal{
    void sound(){
        System.out.println("Animal will make some sort of noise");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("bow bow ");
    }
}

class Monkey extends Animal{
    void sound(){
        System.out.println("some sound ");
    }

}
 
class Cat extends Animal{
    void sound(){
        System.out.println("meow meow");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args) {
        
    }

} 
