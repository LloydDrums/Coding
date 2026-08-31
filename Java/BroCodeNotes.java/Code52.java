// July 29, 2025

public class Code52 {
    public static void main(String[] args) {
        // Protect object data + add rules for modifying them
            // Getters =  methods make READABLE fields.
            // Setters =  methods make WRITEABLE fields.

        Car car = new Car ("Ford", "Sky Blue", 55000);

        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice()); // you can access now

        car.setColor("Black"); // writes new method
        car.setPrice(-500);
        
    }
}

class Car {
    private String model; // if it's private, there's no access
    private String color;
    private int price;

    Car(String model, String color, int price) {
        this.model = model; // The parameters for the Car
        this.color = color;
        this.price = price;
    }

    String getModel(){ // Get methods use to read. getAttribute 
        return this.model;
    }
    String getColor(){
        return this.color;
    }
    String getPrice(){
        return "$" + this.price; // Changes to "Ford Sky Blue $55000"
    }

    // Setters
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        if(price < 0){
            System.out.println("Price can not be less than zero");
        }
        else {
            this.price = price; 
            }
        }
}