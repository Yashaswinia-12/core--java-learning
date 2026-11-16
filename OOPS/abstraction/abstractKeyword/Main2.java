package OOPS.abstraction.abstractKeyword;


abstract class Shape {

    abstract double calculateArea();
}

class Rectangle extends Shape {

    double length = 10;
    double breadth = 5;

    double calculateArea() {
        return length * breadth;
    }
}

class Circle extends Shape {

    double radius = 7;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

public class Main2 {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        System.out.println("Rectangle Area: " + r.calculateArea());

        Circle c = new Circle();
        System.out.println("Circle Area: " + c.calculateArea());
    }
}
