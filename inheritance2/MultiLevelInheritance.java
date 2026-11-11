package inheritance2;

class Vehicle{
void start(){
        System.out.println("vehicle will start");
    }
   
    void stop(){
        System.out.println("Vehicle stop");
    }
}

class Car extends Vehicle{
    int doors=4;
    void fuelType(){
        System.out.println("Some power need to start");
    }
}
class EVCar extends Car{
    int batCap=500;

    @Override 
    void fuelType(){
        super.fuelType();
        System.out.println("Need battery to start the car");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
    EVCar ev=new EVCar();
    ev.start();
    ev.stop();
    ev.fuelType();
    System.out.println(ev.doors);
    ev.fuelType();
    System.out.println(ev.batCap);
        
    }

}
