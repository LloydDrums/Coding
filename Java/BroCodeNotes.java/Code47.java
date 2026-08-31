// July 29, 2025

public class Code47 {
    public static void main(String[] args) {

        // .toString() = method inherited from Object class
        /* Returns string representation of an object 
            By default, it returns a hash code as an identifier
            It can be overriden to provide meaningful details. */

        Car car = new Car("Honda", "Civic", 2012, "Grey");
        Car car2 = new Car("Toyota", "Corolla", 2013, "Black");

        System.out.println(car);
        System.out.println(car2);

    }
}

class Car {

    String make;
    String model;
    int year;
    String color;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override // Displays the object details
    public String toString(){ // inherit from object
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}