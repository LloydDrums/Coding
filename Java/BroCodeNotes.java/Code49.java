// July 29, 2025

public class Code49 {
    public static void main(String[] args) {

        // Interface = blueprint for a class that has a set of abstract methods
        /* Implemented classes MUST be defined
            Support multiple inheritance-like behavior. */

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}

interface Prey { // like a contract

    void flee(); // flee method to run away
}

interface Predator {

    void hunt(); // hunt method
}

class Rabbit implements Prey { // Prey except that one rabbit from Monty Python and the Holy Grail

    @Override
    public void flee(){
        System.out.println("*The rabbit runs away.*");
    }
}

class Hawk implements Predator {

    @Override
    public void hunt(){
        System.out.println("*The hawk is hunting.*");
    }
}

class Fish implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("*The fish swims away.*");
    }

    @Override
    public void hunt() {
        System.out.println("*The fish is hunting.*");
    }
}