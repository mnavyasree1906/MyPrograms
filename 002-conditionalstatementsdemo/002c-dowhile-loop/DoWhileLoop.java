package example.conditionalstatements;

import java.util.Scanner;
import java.util.Random;

    public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1: Add All Entered Numbers
        
        System.out.println("Task 1: Adding all entered numbers.");
        int number;    // Variable to store each entered number
        int sum = 0;   // Variable to store the total sum of entered numbers

        // Using do-while loop to keep accepting numbers until user enters 0
        do {
            System.out.print("Enter a number to add (0 to stop): ");
            number = scanner.nextInt();  // Read the entered number
            sum += number;               // Add the entered number to sum
        } while (number != 0);           // Exit the loop when 0 is entered

        System.out.println("Total sum of entered numbers is: " + sum);
        System.out.println("**************************************");

        // Task 2: Guessing a Random Number
        
        System.out.println("Task 2: Guess the random number between 1 and 100.");
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate random number from 1 to 100
        int guess; // Variable to store user's guess

        // Using do-while loop to allow the user to keep guessing
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // Read the users guess

            // Provide feedback to the user based on their guess
            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            }
        } while (guess != randomNumber); // Continue until the user guesses correctly

        // Close the scanner
        scanner.close();
    }
}
