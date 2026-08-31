// July 31, 2025

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Code59 {
    public static void main(String[] args) {
        // Reading files in Java (3 options)
            /* BufferedReader + FileReader = line by line text file */
            /* FileInputStream = binary files (audio, images) */
            /* RandomAccessFile = read/write specific portions of a large file */

        // BufferedReader + FileReader example
        String filePath = "C:\\Users\\lloyd\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) { 
            System.out.println(line);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}