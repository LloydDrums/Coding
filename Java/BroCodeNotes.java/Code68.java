// August 1, 2025

import java.util.Scanner;

public class Code68 {

    public static void main(String[] args) {
        // Enums (enumerations) = kind of class representing a fixed constant set
        // Improve code readability & easy to maintain
        // More efficient with switches rather than comparing Strings

        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {
            // Enhanced switch. Examining Day objects
            Day day = Day.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.println("It is a weekday");
                case SATURDAY, SUNDAY ->
                    System.out.println("It is the weekend");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }
        
        scanner.close();
 
        // Day day = Day.WEDNESDAY;
        // System.out.println(day); -> print out the day of the week
        // System.out.println(day.getDayNumber()); -> get the # of the day of the week
    }
}

enum Day { // declaring constants. Common: all letters are UPPERCASE

    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int dayNumber;

    Day(int dayNumber){ // Constructor for the constants
        this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
        return this.dayNumber;
    }
}