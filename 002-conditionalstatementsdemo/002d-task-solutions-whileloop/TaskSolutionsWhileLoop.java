package example.conditionalstatements;

public class TaskSolutionsWhileLoop {

    //Task 1: Print Even Numbers from 1 to 100
    // This method is public, allowing access from anywhere
    public static void printEvenNumbers() {
        int i = 1; // Initialize the counter variable
        while (i <= 100) { // Loop from 1 to 100
            if (i % 2 == 0) { // Check if the number is even
                System.out.print(i + "\t"); // Print the even number followed by a tab
            }
            i++; // Increment the counter
        }
        System.out.println(); // Move to the next line after printing even numbers
        System.out.println("**************************************");
    }

    // Task 2: Print Letters from 'z' to 'a'
    // This method is protected, allowing access within the same package and by subclasses
    protected static void printReverseAlphabet() {
        char letter = 'z'; // Start from 'z'
        while (letter >= 'a') { // Loop until 'a'
            System.out.print(letter + "\t"); // Print the letter followed by a tab
            letter--; // Move to the previous letter
        }
        System.out.println(); // Move to the next line after printing letters
        System.out.println("**************************************");
    }

    // Task 3: Print ASCII Codes from 'z' to 'a'
    // This method is private, allowing access only within this class
    private static void printAsciiCodes() {
        char letter = 'z'; // Start from 'z'
        while (letter >= 'a') { // Loop until 'a'
            // Print the character and its ASCII code
            System.out.println("Character: " + letter + " | ASCII Code: " + (int) letter);
            letter--; // Move to the previous letter
        }
        System.out.println(); // Move to the next line after printing ASCII codes
        System.out.println("**************************************");
    }

    // Task 4: Sum of N Natural Numbers Using Recursion
    // This method is private and returns the sum of the first n natural numbers
    private static int sumOfNaturalNumbers(int n) {
        if (n == 1) { // Base case: if n is 1, return 1
            return 1;
        } else {
            // Recursive call: add n to the sum of the first (n-1) natural numbers
            return n + sumOfNaturalNumbers(n - 1);
        }
        
    }
    
    // Task 5: Return Difference of Sum of Even and Odd Numbers up to a Limit
    // This method calculates and returns the difference between the sum of even and odd numbers
    public static int differenceOfEvenAndOddSum(int limit) {
        int evenSum = 0;
        int oddSum = 0;
        
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                evenSum += i; // Add to even sum if number is even
            } else {
                oddSum += i; // Add to odd sum if number is odd
            }
        }
        
        // Return the difference between evenSum and oddSum
        return evenSum - oddSum;
    }
    

    // Task 6: Print 1 to 100 Without Using Any Numbers in Logic
    // This method is protected
    protected static void printNumbersWithoutDirectNumbers() {
        int count = 'd' - 'a' + 1; // Calculate the number 4 using character arithmetic
        int i = 1; // Initialize the counter
        while (i <= count * 25) { // Loop until 100 (4 * 25)
            System.out.print(i + "\t"); // Print the number followed by a tab
            i++; // Increment the counter
        }
        System.out.println(); // Move to the next line after printing numbers
        System.out.println("**************************************");
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Call each task method and print the results
        System.out.println("Task 1: Even Numbers from 1 to 100");
        printEvenNumbers();

        System.out.println("\nTask 2: Letters from 'z' to 'a'");
        printReverseAlphabet();

        System.out.println("\nTask 3: ASCII Codes from 'z' to 'a'");
        printAsciiCodes();

        System.out.println("\nTask 4: Sum of N Natural Numbers");
        int n = 10; // Change this value for a different sum
        int sum = sumOfNaturalNumbers(n); // Call the method to calculate the sum
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        
        System.out.println("\nTask 5: Difference of Sum of Even and Odd Numbers");
        int limit = 10; // Change this limit to any desired number
        int difference = differenceOfEvenAndOddSum(limit);
        System.out.println("Difference between sum of even and odd numbers up to " + limit + " is: " + difference);

        System.out.println("\nTask 6: Print Numbers from 1 to 100 without Using Numbers in Logic");
        printNumbersWithoutDirectNumbers(); // Call the method to print numbers
    }
}
