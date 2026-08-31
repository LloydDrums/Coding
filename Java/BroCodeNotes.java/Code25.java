// July 25, 2025

import java.util.Scanner; 

public class Code25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /* nested loop = loop inside another loop.
            Used with matrices of DS&A [Data structures & analysis]*/

        /* j is another alternative for 'i' in the for loop
            if you use i alot, it gives an error */

        for (int i = 1; i <= 3; i++) { // outter loop
            for (int j = 1; j <= 9; j++) { // inner loop
                System.out.println(j + " ");
        }
        System.out.println();
        
        }

        // Here it is with your user input
        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows:");
        rows = scanner.nextInt();

        System.out.print("Enter the # of columns:");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use:");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i <= rows; i++) { // outter loop
            for (int j = 1; j < columns; j++) { // inner loop
            System.out.print(symbol);
        }
        System.out.println();
        
        }
        scanner.close();
    }   
}