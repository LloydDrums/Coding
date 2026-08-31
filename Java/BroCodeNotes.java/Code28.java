// July 26, 2025

public class Code28 {

    public static void main(String[] args) {
        // Variable scope = where variables can be accessed
        
        // Local = declared in a method, only accessed within the method
        // Class = declared in a class, accessed by all methods in the class
        /* Think of local as neighbors  not seeing the inside of each other's house*/
        
        // Local variable example:

        int x = 1; // LOCAL
        System.out.println(x); // Prints "1" to the console.

        doSomething(); // the method is called here for the local variable
        anotherMethod(); // Calling another method for the class variable

    }
    static void doSomething(){ // this method is not aware of int x = 1;
        int x = 2; // It's legal if its the same name, different method

        System.out.println(x); // Prints "2" to the console.
    }

    // Class variable example:
    static int y = 3; // CLASS
    static void anotherMethod() {
        System.out.println(y); // Prints "3" to the console.
    }
}