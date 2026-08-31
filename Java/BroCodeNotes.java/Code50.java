// July 29, 2025

public class Code50 {
    public static void main(String[] args) {

        // Polymorphism = Many (poly) shapes (morph)
        /* Objects can INDENTIFY as other objects
            and can be treated as objects of a common superclass. */

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        
        Vehicle[] vehicles = {car, bike, boat}; // in an array

        for (Vehicle vehicle : vehicles){ // for-each loop
            vehicle.go(); // takes every vehicle object and calls go method
        }
    }
}

// Polymorphism can be achieved by using interfaces
interface Vehicle {

    abstract void go();

}

class Car implements Vehicle {

    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}

class Bike implements Vehicle {

    @Override
    public void go(){
        System.out.println("You drive the bike");
    }
}

class Boat implements Vehicle {

    @Override
    public void go(){
        System.out.println("You sail the boat");
    }
}