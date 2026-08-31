// July 27, 2025

public class Code39 {
    public static void main(String[] args) {
    
        // This is a code about object oriented programming
        // Object = reference data type that can have and do things
                /* Entity that hold data (attribute example for humans: name, age, height, etc.) */
                /* Perform actions (method example for humans: eat, sleep, run, etc.)*/

        Car car = new Car(); // creates New car object

        System.out.println(car.make + " " + car.model); // prints Ford
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        car.drive(); // drives the car
        car.brake(); // brakes the car
    }
}

class Car { // attributes (what a car has). This is outside of the main method.

            String make = "Ford";
            String model = "Mustang";
            int year = 2013;
            double price = 10.99;
            boolean isRunning = false;

        // Methods (actions a car can do)
        void start() { // Method to start the car
        isRunning = true; // sets isRunning to true
            System.out.println("You start the engine.");
        }

        void stop() {
            isRunning = false; // sets isRunning to false
            System.out.println("You stop the engine.");
        }

        void drive() {
            System.out.println("You drive the " + model);
        }

        void brake() {
            System.out.println("You brake the " + model);
        }
}