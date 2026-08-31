// July 23, 2025
import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        // This code is about substrings
        // .substring() = string extraction;
        // .substring(start, end)

        String email = "GordonDrums@gmail.com";

        String username = email.substring(0, 11);
        System.out.println(username); // Prints "GordonDrums" to the console.
        
        String domain = email.substring(12, 21);
        System.out.println(domain); // Prints "gmail.com" to the console.

        String email2 = "GordonDrums1@gmail.com";
        String username2 = email2.substring(0, 12);
        System.out.println(username2); // Prints "GordonDrums1" to the console.
        
        String domain2 = email2.substring(13); // optional: You don't need the endIndex, since it prints out the rest for you.
        System.out.println(domain2); // Prints "gmail.com" to the console.

        // Index of method
        String email3 = "GordonDrums1@gmail.com";
        String username3 = email3.substring(0, email3.indexOf("@"));
        System.out.println(username3); // Prints "GordonDrums" to the console.
        
        String domain3 = email3.substring(0, email3.indexOf("@") + 1);
        System.out.println(domain3);

        Scanner scanner = new Scanner(System.in);

        String email4;
        String username4;
        String domain4;

        System.out.print("Enter your email: ");
        email4 = scanner.nextLine();

        if (email4.contains("@")) {
            username4 = email4.substring(0, email4.indexOf("@"));
            domain4 = email4.substring(email4.indexOf("@") + 1);

            System.out.println(username4);
            System.out.println(domain4);
        } else {
            System.out.println("Emails must contain @");
        }

        scanner.close();
    }
}