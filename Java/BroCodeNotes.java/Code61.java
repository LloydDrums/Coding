// August 1, 2025

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Code61 {
   public static void main(String[] args) {
    // HANGMAN Game
    String filePath = "words.txt"; // filePath here
    ArrayList<String> words = new ArrayList<>();

    try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
        String line;
        while((line = reader.readLine()) !=null){
            words.add(line.trim());
        }
    }
    catch (FileNotFoundException e){
        System.out.println("Could not find file");
    }
    catch (IOException e){
        System.out.println("Something went wrong");
    }

    Random random = new Random();
    String word = words.get(random.nextInt(words.size()));
    Scanner scanner = new Scanner(System.in);
    ArrayList<Character> wordState = new ArrayList<>();
    int wrongGuess = 0;

    for (int i = 0; i < word.length(); i++) {
        wordState.add('_');
    }

    System.out.println("Welcome to Java Hangman!");

    while (wrongGuess < 6) {
        System.out.print(getHangmanArt(wrongGuess));
        System.out.print("Word:");
        for (char c : wordState) {
            System.out.print(c + "");
        }
        System.out.print(" Guess a letter:");
        char guess = scanner.next().toLowerCase().charAt(0);

        if (word.indexOf(guess) >= 0) { // If user guesses a character (or letter) right
            System.out.println("Correct guess!");
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    wordState.set(i, guess);
                }
            }
            if (!wordState.contains('_')) { // If user guesses the word correctly
                System.out.println(getHangmanArt(wrongGuess));
                System.out.println("You win!");
                System.out.println("The word was " + word);
                break;
            }
        } else { // If user guesses wrong word
            wrongGuess++;
            System.out.println("Wrong guess");
        }
    }

    if (wrongGuess >= 6) {
        System.out.println(getHangmanArt(wrongGuess));
        System.out.println("Game over");
        System.out.println("The word actually was " + word);
    }
    scanner.close();

    for (int i = 0; i < word.length(); i++) {
        wordState.add('_');
    } // For-loop


    System.out.println("Welcome to Java Hangman!");

    while(wrongGuess < 6) {

        System.out.print(getHangmanArt(wrongGuess));
        
        System.out.print("Word:");

    for (char c : wordState) { // No more bad formatting
        System.out.print(c + ""); // All on the same line
    }
    
    System.out.print("Guess a letter:"); // User input
    char guess = scanner.next().toLowerCase().charAt(0); // with the string, give me 1st character

    if(word.indexOf(guess) >= 0){
        System.out.println("Correct guess!");

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == guess){
                wordState.set(i, guess);
            }
        }

        if(!wordState.contains('_')){
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("You win!");
            System.out.println("The word was " + word);
            break;
        }

    }
    else {
        wrongGuess++;
        System.out.println("Wrong guess");
        }
    }
    
    if(wrongGuess >= 6){
        System.out.println(getHangmanArt(wrongGuess));
        System.out.println("Game over");
        System.out.println("The word actually was " + word);
    }
        scanner.close(); 
}

static String getHangmanArt(int wrongGuesses){ // ASCII art

        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}