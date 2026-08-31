// July 30, 2025

public class Code54 {
    public static void main(String[] args) {
    // Composition = A "part-of" relationship between objects
            // For example, an engine is "part of" a Car.

        Car car = new Car ("Honda", 2012, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type); // Access the engine type

        car.start();
    }
}

class Car {
    String model;
    int year;
    Engine engine;

    Car (String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println("Your" + this.model + "is running");
    }
}

class Engine {
    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You start the " + this.type + "engine");
    }
}