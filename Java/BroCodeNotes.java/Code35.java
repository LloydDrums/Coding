// July 27, 2025

public class Code35 {
    public static void main(String[] args) {

        // 2D arrays = array of arrays, like a table of rows/columns

            String[][] people = {
                {"Amanda", "Gordon", "Larry"}, 
                {"coffee", "tea", "juice"}, 
                {"bubbly", "quiet", "wacky"}
            };

            people[2][1] = "crazy"; // Change the second element of the third row to "crazy"
            for (String[] row : people) {
                for (String item : row) {
                    System.out.print(item + " "); // Prints each item in the 2D array
                }
                System.out.println(); // New line after each row
            }

        // Mini-project of a 2D array of telephone pad
        char [][] telephone = {{'1', '2', '3'},
                                {'4', '5', '6'},
                                {'7', '8', '9'},
                                {'*', '0', '#'} };
        for (char[] row : telephone){
            for (char number: row) {
                System.out.print(number + " "); // Prints each number in the telephone pad
            }
            System.out.println(); // New line after each row
        }
    }
}