// August 1, 2025

import java.util.HashMap;

public class Code67 {
    public static void main(String[] args) {
        // HashMap: A data structure that stores key-value pairs
        // Keys are unique, Values can be duplicated
        // Does not maintain memory order, but is memory efficent
        // HashMap<Key, Value>

    // HashMap example
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.25);
        map.put("plum", 0.50);
        map.put("banana", 1.00);
        map.put("coconut", 1.25);

    // map.remove("apple"); -> Removes a key

    // System.out.println(map.get("apple")); -> Prints the double of a key

    // System.out.println(map.containsKey("banana")); -> checks as a boolean

    // As an if-else statement for a containsKey method
        /*  if(map.containsKey("pineapple")){ 
                System.out.println(map.get("pineapple"));
            }
            else {
                System.out.println("Key not found");
            } */

    /* Check to see if map contains a value:
       System.out.println(map.containsValue(1.00)); */

    /* Returning a size of a map
       System.out.println(map.size()); -> returns a number */

    // Printing a map using an enhanced for loop:
       for (String key : map.keySet()) { // [: -> for every key in the set of keys]
           System.out.println(key + " : $ " + map.get(key));
       }
    }
}