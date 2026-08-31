// August 1, 2025

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Code65 {
    public static void main(String[] args) {
        // COUNTDOWN TIMER PROGRAM based off of Code 64:
        // Timer = class that schedules tasks at specific/periodic time
        // TimerTask = Executed by the time. Extend TimerTask and define the tasks

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter # of seconds to countdown from");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() { // Anonymous class

            int count = response;

            @Override
            public void run(){
                System.out.println(count);
                count--; // Decrement (down) by 1
                if (count <= 0){ // Escape
                    System.out.println("You got this");
                    timer.cancel(); // Stops the timer
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // After a delay of # seconds, print "Hello" every 1000 millisecond
        
        scanner.close();
    }
}