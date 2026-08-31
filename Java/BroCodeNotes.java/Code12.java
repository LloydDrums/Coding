// July 23, 2025

public class Code12 {
    public static void main(String[] args) {
        // This code is about nested if statements

    // Nested if statements are if statements within if statements.

    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

            if (isStudent) {
                if (isSenior) {
                System.out.println("You get a senior discount of 20%!");
                System.out.println("You get a student discount of 10%!");
                price *= 0.7; 
                }
                else {
                System.out.println("You get a student discount of 10%!");
                price *= 0.9;
                }
            }
            else {
                if (isSenior) {
                System.out.println("You get a senior discount of 20%!");
                price *= 0.8;
              
                }
            else {
                price *= 1;
            }
            System.out.printf("Your ticket price is: $%.2f" + price);
            }
        System.out.printf("Your final ticket price is: $%.2fn", price);
    }
}