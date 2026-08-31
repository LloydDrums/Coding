// August 1, 2025

public class Code66 {
    public static void main(String[] args) {
        // Generics: concept where you can write a class, interface or methodt
        // that is compatible with other data types.
        // <T, U> are type parameter (placeholder that is replaced with a real type)
        // <String> type argument (specifies type)

    // Generics of type argument example
        // Here, String and Double are the type arguments.
        Product<String, Double> product1 = new Product<>("apple", 0.50);
        System.out.println("Item: " + product1.getItem() + ", Price: " + product1.getPrice());
        
        // Another example with different types.
        // Here, String and Integer are the type arguments.
        Product<String, Integer> product2 = new Product<>("banana", 15);
        System.out.println("Item: " + product2.getItem() + ", Price: " + product2.getPrice());
    }
}
// It uses generic type parameters T and U.
class Product<T, U> { // This class is defined outside the main method.
    T item;
    U price;

    // Constructor's name and class name must match.
    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    // Method to get the item, returning the generic type T.
    public T getItem() {
        return this.item;
    }

    // Method to get the price, returning the generic type U.
    public U getPrice() {
        return this.price;
    }
}