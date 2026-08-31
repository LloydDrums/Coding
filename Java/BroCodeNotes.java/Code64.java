// August 1, 2025

import java.util.Timer;
import java.util.TimerTask;

public class Code64 {
    public static void main(String[] args) {
        // Timer = class that schedules tasks at specific/periodic time
        // TimerTask = Executed by the time. Extend TimerTask and define the tasks

        Timer timer = new Timer();
        TimerTask task = new TimerTask() { // Anonymous class

            int count = 3;

            @Override
            public void run(){
                System.out.println("Hello!");
                count--; // Decrement (down) by 1
                if (count <= 0){ // Escape
                    System.out.println("Task complete");
                    timer.cancel(); // Cancels the timer
                }
            }
        };

        timer.schedule(task, 0, 1000); // After a delay of # seconds, repear "Hello" every 1000 millisecond
    }
}