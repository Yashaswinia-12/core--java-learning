package OOPS.abstraction.coupling;

class Vehicle{
    void run(){
        System.out.println("Runs on petrol");
    }
}

class Car{
    void run(){
        Vehicle vehicle=new Vehicle();
        vehicle.run();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.run();
    }

}
