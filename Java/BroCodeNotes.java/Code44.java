// July 29, 2025

public class Code44 {
    public static void main(String[] args) {

        // Inheritance = A class inherits attributes/methods from another class
        /* Like genetics or traits: Child <- Parent <- Grandparent */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.speak();
        cat.speak();
        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}

class Animal  extends Organism{
    

    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog extends Animal{
    int lives = 1;

    void speak() {
        System.out.println("The dog goes *woof*");
    }
}

class Cat extends Animal{
    int lives = 9;

    void speak() {
        System.out.println("The cat goes *meow*");
    }
}

class Organism{
    boolean isAlive;

    Organism() {
        isAlive = true;
    }
}

class Plant extends Organism{
    void photosynthesize(){
        System.out.println("The plant absorbs sunlight");
    }
}