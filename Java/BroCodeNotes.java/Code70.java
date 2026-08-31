// August 1, 2025

public class Code70 {

    public static void main(String[] args) {
        // Multithreading allows programs to run multiple threads
        /* Threads are an instruction set running independently */

        Thread thread1 = new Thread(new MyRunnable("See")); // Concise
        Thread thread2 = new Thread(new MyRunnable("Saw")); // Concise
        
        System.out.println("Game start");

        thread1.start(); // Call start method of thread1
        thread2.start(); // Call start method of thread2

        try {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
            throw new RuntimeException(e);
        }

        System.out.println("Game over");
        }   
}

class MyRunnable implements Runnable{ // Runnable class

private final String text;

  MyRunnable(String text) {
        this.text = text;
    }

    @Override // override run method
    public void run(){
        for (int i = 1; i <= 5; i++) { // For loop
        
        try {
            Thread.sleep(1000); // Java thread of sleep for # of milliseconds
            System.out.println(text);
        } 
        catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
            }
        }
    }
}