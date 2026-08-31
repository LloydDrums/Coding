// July 26, 2025

public class Code27 {

    public static void main(String[] args) {
        // Overloaded methods = methods with the same name but different parameters

        // Example with overloaded methods
        System.out.println(add(1, 2, 3, 4));

        // Another example with overloaded methods
        String pizza = bakePizza("flat bread", "mozzarella", "pepperoni");
        System.out.println(pizza); // Prints "pepperoni mozzarella flat bread pizza"
    }
    
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " " + cheese + " " + bread + " pizza";
    }
}

// signature = name + parameters