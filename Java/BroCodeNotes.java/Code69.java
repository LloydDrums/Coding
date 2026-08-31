// August 1, 2025

import java.util.Scanner;

public class Code69 {

    public static void main(String[] args) {
        // Threading allows programs to run tasks simultaneously
        /* Improves performance with time-consuming operations like:
            (File I/0, network communications, any background tasks) */

        // Implement a Runnable interface (better)

        // Scanner object -> get user input
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable(); // Created an object
        Thread thread = new Thread(myRunnable); // Object passing into thread
        thread.setDaemon(true); // Daemon thread -> End as main thread is finished
        thread.start(); // Call start method

        System.out.print("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
        
        scanner.close();
    }   
}

class MyRunnable implements Runnable{ // Runnable class
    @Override
    public void run(){
        for (int i = 1; i <= 10; i++) { // For loop
        
        try {
            Thread.sleep(1000); // Java thread of sleep for # of milliseconds
     
        } 
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        if(i == 10){
            System.out.println("Time is up");
            System.exit(0); // Exits the program with an exit method
            }
        }
    }
}