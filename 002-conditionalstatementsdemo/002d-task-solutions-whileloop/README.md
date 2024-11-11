## Task Solutions Using While Loop

This Java program contains several tasks demonstrating different uses of the `while` loop and recursion.

### Task 1: Print Even Numbers from 1 to 100

This task prints all even numbers between 1 and 100 using a `while` loop.

#### Code:
```java
// Task 1: Print Even Numbers from 1 to 100
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
```
#### Explanation:
- The loop runs from 1 to 100.
- If the number is even (i % 2 == 0), it is printed.
- The loop continues until 100.
---
  
### Task 2: Print Letters from 'z' to 'a'
This task prints the alphabet from 'z' to 'a' in reverse order.

#### Code:
```java
// Task 2: Print Letters from 'z' to 'a'
protected static void printReverseAlphabet() {
    char letter = 'z'; // Start from 'z'
    while (letter >= 'a') { // Loop until 'a'
        System.out.print(letter + "\t"); // Print the letter followed by a tab
        letter--; // Move to the previous letter
    }
    System.out.println(); // Move to the next line after printing letters
    System.out.println("**************************************");
}
```
#### Explanation:
- The while loop starts from 'z' and decrements to 'a', printing each letter.
- The loop stops once 'a' is printed.
---

### Task 3: Print ASCII Codes from 'z' to 'a'
This task prints the ASCII codes of the alphabet from 'z' to 'a'.

#### Code:
```java
// Task 3: Print ASCII Codes from 'z' to 'a'
private static void printAsciiCodes() {
    char letter = 'z'; // Start from 'z'
    while (letter >= 'a') { // Loop until 'a'
        System.out.println("Character: " + letter + " | ASCII Code: " + (int) letter);
        letter--; // Move to the previous letter
    }
    System.out.println(); // Move to the next line after printing ASCII codes
    System.out.println("**************************************");
}
```
#### Explanation:
- The while loop prints the character and its ASCII code, decrementing from 'z' to 'a'.
- The ASCII value is obtained using (int) letter.
---

### Task 4: Sum of N Natural Numbers Using Recursion
This task calculates the sum of the first n natural numbers using recursion.

#### Code:
```java
// Task 4: Sum of N Natural Numbers Using Recursion
private static int sumOfNaturalNumbers(int n) {
    if (n == 1) { // Base case: if n is 1, return 1
        return 1;
    } else {
        // Recursive call: add n to the sum of the first (n-1) natural numbers
        return n + sumOfNaturalNumbers(n - 1);
    }
}
```
#### Explanation:
- This method uses recursion to add n to the sum of numbers from 1 to n-1.
- The base case is when n == 1, returning 1.
---

### Task 5: Return Difference of Sum of Even and Odd Numbers up to a Limit
This task calculates the difference between the sum of even numbers and odd numbers up to a specified limit.

#### Code:
```java
// Task 5: Return Difference of Sum of Even and Odd Numbers up to a Limit
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
```
#### Explanation:
- The method loops through numbers from 1 to the specified limit.
- Even numbers are added to evenSum, and odd numbers to oddSum.
- The difference between the two sums is returned.
---

### Task 6: Print 1 to 100 Without Using Any Numbers in Logic
This task prints numbers from 1 to 100 without directly using numbers in the loop logic.

#### Code:
```java
// Task 6: Print 1 to 100 Without Using Any Numbers in Logic
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

```
#### Explanation:
- Instead of using numbers directly, the method calculates 4 using character arithmetic ('d' - 'a' + 1).
- The loop runs until the count reaches 100.
---

### Output:
![image](https://github.com/user-attachments/assets/91662930-1409-41a7-99ed-02ef3c408f1c)


---

