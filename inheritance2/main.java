package inheritance2;
class Vehicle{
     void start(){
        System.out.println("vehicle will start");
    }
    void show(){
        System.out.println("show the details of car vehicle");
    }
    void stop(){
        System.out.println("Vehicle stop");
    }

}
class BMWCar extends Vehicle{
     @Override
    void start(){
        super.start();
        System.out.println("Play musics and open roofs");
    }

}

public class main {
    public static void main(String[] args) {
        BMWCar bmw=new BMWCar();
        bmw.start();
        bmw.show();
        bmw.stop();

        
    }
}




