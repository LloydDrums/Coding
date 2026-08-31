// July 23, 2025

public class Code16 {
    // Ternary operator = ? = Returns 1 of 2 values if a condition is true
        /* variable = (condition) ? ifTrue : ifFalse */

    public static void main(String[] args) {

        // example without ternary operator:
        int score = 25;

        if ( score >= 60) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        // example with ternary operator (alternative to if-else statement):
        int score2 = 70;

        String passOrFail = (score2 >= 60) ? "PASS" : "FAIL"; // : is known as otherwise
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2) == 0 ? "EVEN" : "ODD";
        System.out.println(evenOrOdd);

        int hours = 13; // 13 hours for example = 1 P.M.
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

        }
    }