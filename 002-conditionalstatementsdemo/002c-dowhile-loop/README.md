## Do-While Loop Examples

This Java program demonstrates two tasks using the `do-while` loop:

### Task 1: Add All Entered Numbers

- **Purpose**: This task continuously asks the user to input numbers and adds them together. The loop stops when the user enters `0`, at which point the program prints the total sum of all entered numbers.

#### Code:
```java
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
```
#### Explanation:
1. The program prompts the user to input a number to add.
2. Each number is added to a running total (sum).
3. The `do-while` loop ensures that the program keeps accepting numbers until `0` is entered.
4. Once `0` is entered, the program exits the loop and prints the sum of all entered numbers.

---

### Task 2: Guessing a Random Number

- **Purpose**: This task generates a random number between 1 and 100 and prompts the user to guess it. The program provides feedback whether the guess is too high or too low, and continues until the correct number is guessed.
```java
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
```
#### Explanation:
1. A random number between 1 and 100 is generated using the `Random` class.
2. The program prompts the user to enter their guess.
3. Based on the guess, the program provides feedback (too high, too low, or correct).
4. The loop continues until the user guesses the correct number.
5. Once the correct number is guessed, the program congratulates the user and exits the loop.

Both tasks make use of the do-while loop, which ensures that the loop executes at least once, even if the user doesn't meet the exit condition on the first try.

### Output:
![image](https://github.com/user-attachments/assets/06be1e83-bd13-45da-b568-f2e646beb48e)


---

