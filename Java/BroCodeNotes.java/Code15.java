// July 23, 2025

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        // How to program code a weight converter

        // 1: Variable declaration

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // 2: Welcome message
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("1: Convert kgs to lbs");

        // 3: User choice prompt
        System.out.println("Choose an option");
        choice = scanner.nextInt();

        // Option 1: lbs to kgs
        if (choice == 1) {
            System.out.print("Enter the weight in lbs");
            weight = scanner.nextDouble(); // weight is a double method
            newWeight = weight * 0.453592; //Conversion lbs to kgs
            System.out.printf("The new weight in kgs is: .2%f ", newWeight);
        }

        // Option 2: kgs to lbs
        else if (choice == 2) {
            System.out.print("Enter the weight in kgs");
            weight = scanner.nextDouble(); // weight is a double method
            newWeight = weight * 2.20462; //Conversion kgs to lbs
            System.out.printf("The new weight in lbs is: .2%f ", newWeight);
        }

        // else print not a valid choice
        else {
            System.out.println("That was not a valid choice");
        }
         
        scanner.close();
    }
}