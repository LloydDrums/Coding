// July 29, 2025

public class Code42 {
    public static void main(String[] args) {

        // Array of objects

        Car[] cars = {new Car("Honda", "Grey"),
                    new Car("Toyota", "Silver"),
                    new Car("Prius", "White")};

        for(Car car : cars){ // Enhanced for loop
            car.color = "black";
        }

        for(Car car : cars) {
            car.drive();
        }

    }
}

class Car { // Class of an array

    String model;
    String color;

    Car(String model, String color){ // constructor passes in strings
        this.model = model;
        this.color = color;
    }

    void drive (){
        System.out.println("You drive a " + this. color + " " + this.model);
    }
}