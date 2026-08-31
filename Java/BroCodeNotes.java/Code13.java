// July 23, 2025

public class Code13 {
    public static void main(String[] args) {
        // This code is about different string methods

        String name = "Gordon";
        String name2 = "password";

        int length = name.length(); // Length method
        char letter = name.charAt(length); // charAt method.
        int index = name.indexOf(" "); // Finds occurence of a 1st index.
        int lastIndex = name.lastIndexOf(" "); // Finds last index.
        name = name.toUpperCase(); // ALL UPPERCASE CHARACTERS
        name = name.toLowerCase(); // all lowercase characters
        name = name.trim(); // trims any whitespace
        name = name.replace("o", "i"); // replaces a character
        name.isEmpty(); // checks if a name is empty
    
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(name.isEmpty());

        /*
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        
        }
        else {
            System.out.println("Hello" + name);
        } 
        */

       /*
       if (name.contains("")) {
           System.out.println("Your name contains a space");
           
       }
       else {
            System.out.println("Your name does not contain spaces");
       } 
       */

      /*
       if (name2.equals("password")) {
           System.out.println("Your name can't be password");
           
       }
       else {
            System.out.println("Hello" + name2);
       }
       */
        }
    }
