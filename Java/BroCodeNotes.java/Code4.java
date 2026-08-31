// July 18, 2025

import java.util.Scanner;

public class Code4 {

    public static void main(String[] args) {
        // And now for something completely different: A fun code game of MadLibs.

        /* For those who do not know what MadLibs is at all (myself included), here is a brief description:
    
        MadLibs is a game where you fill in the blanks with words to create a story. 
        */

       /* Think of it like the songs "One Of Those Days" or "Everything You Know Is Wrong" both written by "Weird Al" Yankovic. 
       */

        // Let's create a simple MadLibs game.

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        String adverb;

        System.out.println("Enter an adjective (description):");
        adjective1 = scanner.nextLine();
        
        System.out.println("Enter a noun (person, place, or thing)");
        noun1 = scanner.nextLine();

        System.out.println("Enter an adjective (description):");
        adjective2 = scanner.nextLine();

        System.out.println("Enter a verb that ends with -ing (action)");
        verb1 = scanner.nextLine();

        System.out.println("Enter an adjective (description):");
        adjective3 = scanner.nextLine();

        System.out.println("Enter an adjverb (how the action is done):");
        adverb = scanner.nextLine();


        // Create the story using the variables
        String story = "Once upon a time, in a " + adjective1 + " land, lived a " + noun1 + ". " +
                       "This " + noun1 + " was known for its " + adjective2 + " nature. " +
                       "One day, it decided to go " + verb1 + " through the forest. " +
                       "It encountered a " + adjective3 + " creature and " + adverb + " ran away to a peaceful utopia!" +
                       "The end!";

        System.out.println("\nHere's your Mad Libs story:");
        System.out.println(story);


       scanner.close();
    }
}