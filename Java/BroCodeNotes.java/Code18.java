// July 24, 2025

import java.util.Scanner;

public class Code18 {
    // This is about Enhanced Switches (replacement for else if statements)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Before enhanced switches.
        String day = "Friday";

        if(day.equals("Monday")) {
            System.out.println("It's a weekday");
            
        }
        else if (day.equals("Tuesday")) {
            System.out.println("It's a weekday");
            
        }
        else if (day.equals("Wednesday")) {
            System.out.println("It's a weekday");

        }
        else if (day.equals("Thursday")) {
            System.out.println("It's a weekday");
            
        }
        else if (day.equals("Friday")) {
            System.out.println("It's a weekday");
            
        }
        else if (day.equals("Saturday")) {
            System.out.println("It's a weekend");
            
        }
        else if (day.equals("Sunday")) {
            System.out.println("It's a weekend");
            
        }
        else {
            System.out.println(day + "is not a day");
            
        }

        // Here it is with enhanced switches
        String day2 = "Monday";

        switch(day2) {
            case "Monday" -> System.out.println("It's a weekday");
            case "Tuesday" -> System.out.println("It's a weekday");
            case "Wednesday" -> System.out.println("It's a weekday");
            case "Thursday" -> System.out.println("It's a weekday");
            case "Friday" -> System.out.println("It's a weekday");
            case "Saturday" -> System.out.println("It is the weekend");
            case "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println(day + "is not a day");
        }

        //To avoid repitition: consolidate them
        String day3 = "Monday";

        switch(day3) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It's a weekday");
            
            case "Saturday", "Sunday" -> 
                System.out.println("It is the weekend");

            default -> System.out.println(day + "is not a day");
        }

        // Here it is a user prompt for you to try:
        System.out.println("Enter the day of the week: ");
        String day4 = scanner.nextLine();

        switch(day4) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It's a weekday");
            
            case "Saturday", "Sunday" -> 
                System.out.println("It is the weekend");
                
            default -> System.out.println(day + "is not a day");
        }

    }
}