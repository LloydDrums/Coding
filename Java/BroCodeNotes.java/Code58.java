// July 31, 2025

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Code58 {
    public static void main(String[] args) {
        // Writing files in Java (4 options)

            /* FileWriter = small/medium-sized text files */
            /* BufferedWriter = large amount of text */
            /* PrintWriter = structed data (like logs, reports) */
            /* FileOutputStream = binary files (audio, images) */

        // FileWriter example
        String filePath = "test.txt";
        String textContent = "I like pasta\nIt's good sometimes";


            try(FileWriter writer = new FileWriter("test.txt")) {
                writer.write(textContent);
                System.out.println("File has been written");
            }
            catch (FileNotFoundException e){
                System.out.println("Could not locate file location");
            }
            catch (IOException e) {
                System.out.println("Could not write file");
            }
    }
}