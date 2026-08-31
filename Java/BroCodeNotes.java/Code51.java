// July 29, 2025

import java.util.Scanner;

public class Code51 {
    public static void main(String[] args) {

        /* Runtime polymorphism = When the method gets executed is decided
            at runtime based on the actual object type */

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat) ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

    }
}

abstract class Animal {

    abstract void speak();

}

class Dog extends Animal {

    @Override
    void speak(){
        System.out.println("The dog goes *woof*");
    }
}

class Cat extends Animal {

    @Override
    void speak(){
        System.out.println("The cat goes *meow*");
    }
}