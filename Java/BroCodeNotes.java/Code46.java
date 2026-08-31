// July 29, 2025

public class Code46 {
    public static void main(String[] args) {

        // Method overriding = subclass provides its own implentation of a method
        // Allows for code reusability and give specific implementations

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}

class Animal {

    void move(){
        System.out.println("This animal is running");
    }
}

class Dog extends Animal { // child of animal class
}

class Cat extends Animal {
}

class Fish extends Animal {

    @Override
    void move() {
        System.out.println("This animal is swimming");
    }
}