// August 1, 2025

public class Code63 {
    public static void main(String[] args) {
        // Anonymous class (has no name & can't be reused.) Used one time
            /* Add custom behavior without creating a new class */

        Penguin penguin = new Penguin();
        Penguin penguin2 = new Penguin(){ // Class of penguin extension
            @Override
            void speak(){ // single method
                System.out.println("Penguins of Madagascar says *Just smile and wave*");
            }
        };

        penguin.speak();
        penguin2.speak();
    }
}

class Penguin { // Class of penguin
    void speak(){ // single method
        System.out.println("The bird goes tweet");
    }
}