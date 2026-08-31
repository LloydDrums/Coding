// July 25, 2025

public class Code26 {

    public static void main(String[] args) {
        // methods = block of reusable code that's executed when called ()

        // Example without a method:
        
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old");
        System.out.println("Happy Birthday to you!\n");

        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear you!");
        System.out.println("You are x years old");
        System.out.println("Happy Birthday to you!\n");

        // Example with a method:
        System.out.println("--- Example with happyBirthday method ---");
        String name = "Gordon";
        int age = 22;
        
        happyBirthday(name, age); // argument = when you send a method

        System.out.println("--- Example with square method ---");
        double resultSquare = square(3);
        System.out.println("Square of 3: " + resultSquare);

        System.out.println("--- Example with cube method ---");
        double resultCube = cube(2); // Example usage for cube method
        System.out.println("Cube of 2: " + resultCube);

        System.out.println("--- Example with getFullName method ---");
        String fullName = getFullname("Gordon", "Ramsey"); // Changed second name for clarity
        System.out.println("Full Name: " + fullName);

        System.out.println("--- Example with ageCheck method ---");
        int userAge = 21; // Using a different variable name to avoid conflict
        if (ageCheck(userAge)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }
    }

    // This is the 'happyBirthday' method. It takes a String 'name' and an int 'age' as parameters.
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name); // Prints "Happy Birthday dear Gordon!" to the console.
        System.out.printf("You are %d years old!\n", age); // Prints "You are 22 years old!" to the console.
        System.out.println("Happy Birthday to you!\n"); // Prints "Happy Birthday to you!" to console.
    }
    static double square(double number) { 
        return number * number; 
    }

    static double cube(double number) { 
        return number * number * number; 
    }

    static String getFullname(String first, String last) { 
        return first + " " + last; 
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}