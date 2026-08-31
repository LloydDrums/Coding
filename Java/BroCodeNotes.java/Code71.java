// August 1, 2025
// Last code

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.*;

public class Code71 {
    public static void main(String[] args) {
        // JAVA alarm clock that plays music
        
        try (Scanner scanner = new Scanner(System.in)) { // Try-with-resources -> make sure Scanner is always closed.
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Defines the format for the time input
            LocalTime alarmTime = null;
            String filePath = ".wav";

            // Part 1: Get valid alarm time from the user.
            while (alarmTime == null) {
                try {
                    System.out.print("Enter an alarm time (HH:mm:ss): ");
                    String inputTime = scanner.nextLine();
                    alarmTime = LocalTime.parse(inputTime, formatter);  // Parses the user's string into a LocalTime object.
                    System.out.println("Alarm set for " + alarmTime);
                } catch (DateTimeParseException e) { // Handles the case where the user input is not in the correct format.
                    System.out.println("Invalid format. Please use HH:mm:ss");
                }
            }

            // Part 2: Create and start the alarm thread.

            AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner); // An instance of AlarmClock with the user-set time, file path, and scanner is created
            Thread alarmThread = new Thread(alarmClock); // thread to run the alarm logic concurrently.
            alarmThread.start(); // Starts the thread, which calls the run() method in AlarmClock.
        }
    }
}

// Part 3: AlarmClock class and its methods.

class AlarmClock implements Runnable { // The Runnable interface allows an object to be executed as a thread.

    // Final fields to store the alarm time, sound file path, and scanner instance.
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    // Constructor to initialize the AlarmClock object.
    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    // The run() method contains the main logic for the alarm thread.
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) { // Checks the current time until it matches the alarm time.
            try {
                TimeUnit.SECONDS.sleep(1); // Sleeps for one second to prevent the loop from consuming too much CPU.
                /* CPU -> central processing unit*/

                LocalTime now = LocalTime.now();

                System.out.printf("\rCurrent Time: %02d:%02d:%02d",
                        now.getHour(),
                        now.getMinute(),
                        now.getSecond()); // Prints the current time on a single line, overwriting the previous one.
            } catch (InterruptedException e) { // Handles thread interruption.
                System.out.println("Thread was interrupted");
                Thread.currentThread().interrupt(); // Interrupted status is back in
            }
        }
        
        System.out.println("\n\n*ALARM NOISES*"); // When the alarm time is reached, a message is printed and plays the sound of an alarm clock
        playSound(filePath);
    }

    // Method to play a sound file.
    private void playSound(String filePath) {
        File audioFile = new File(filePath); // File object for the audio file.

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) { // Try-with-resources statement -> audioStream closes automatically.
            Clip clip = AudioSystem.getClip(); // Gets a Clip to play the audio.
            clip.open(audioStream); // Open audio stream.
            clip.start(); // Starts playing the audio.
            System.out.print("Press the Enter key to stop the alarm: ");
            
            // Waits for the user to press Enter to stop the alarm.
            scanner.nextLine();
            clip.stop(); // Stops audio playback.
        } catch (UnsupportedAudioFileException e) { // Handles unsupported file intteruption
            System.out.println("Audio file format is not supported.");
        } catch (LineUnavailableException e) { // Handles audio unavailable intteruption
            System.out.println("Audio is unavailable.");
        } catch (IOException e) { // Handles input/output intteruption
            System.out.println("Error reading audio file.");
        }
    }
}