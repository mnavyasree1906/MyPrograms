# Conditional Statements and Loops - Java Code

This Java program demonstrates various tasks using `while` loops, recursion, and other conditional statements.

### Tasks Implemented:

## Task 1: Print Numbers Divisible by 5 from 1 to 100 (Public Method)

```java
public static void printDivisiblesOf5() {
    int i = 1;
    while (i <= 100) {
        if (i % 5 == 0) {
            System.out.print(i + " ");
        }
        i++;
    }
}
```
This method prints all numbers divisible by 5 from 1 to 100 using a while loop. It checks if a number is divisible by 5 (i % 5 == 0) and then prints it.

## Task 2: Sum of Numbers from 50 to 1 (Default Method)
```
static void sumFrom50To1() {
    int i = 50;
    int sum = 0;
    while (i >= 1) {
        sum += i;
        i--;
    }
    System.out.println("Sum of numbers from 50 to 1 is: " + sum);
}
```
This method calculates the sum of all integers from 50 down to 1 using a while loop. The loop runs as long as i >= 1 and accumulates the sum.

## Task 3: Print Alphabets from A to Z (Private Method)
```
private static void printAlphabets() {
    char letter = 'A';
    while (letter <= 'Z') {
        System.out.print(letter + " ");
        letter++;
    }
}
```
This method prints the alphabets from A to Z using a while loop. It starts with the character 'A' and keeps incrementing it until 'Z' is reached.

## Task 4: Print ASCII Codes for Alphabets A to Z (Protected Method)
```
protected static void printAsciiCodes() {
    char letter = 'A';
    while (letter <= 'Z') {
        System.out.println(letter + " " + (int) letter);
        letter++;
    }
}
```
This method prints the ASCII values for each alphabet from A to Z. It uses the while loop to iterate over each alphabet and prints both the character and its ASCII value.

## Task 5: Print Multiplication Table of a Number (Public Method)
```
public static void printMultiplicationTable(int num) {
    int i = 1;
    while (i <= 10) {
        System.out.println(num + " x " + i + " = " + (num * i));
        i++;
    }
}
```
This method prints the multiplication table for a given number. The while loop multiplies the number num by i (ranging from 1 to 10) and prints the result.

## Task 6: Sum of First n Natural Numbers (Private Method)
```
private static int sumOfNaturalNumbers(int n) {
    int sum = 0;
    int i = 1;
    while (i <= n) {
        sum += i;
        i++;
    }
    return sum;
}
```
This method calculates the sum of the first n natural numbers. The while loop runs from 1 to n, adding each number to the sum.

## Task 7: Factorial of n using a While Loop (Protected Method)
```
protected static int factorialUsingWhileLoop(int n) {
    int fact = 1;
    int i = 1;
    while (i <= n) {
        fact *= i;
        i++;
    }
    return fact;
}
```
This method calculates the factorial of a number n using a while loop. The loop multiplies fact by i for every number from 1 to n.

## Task 8: Factorial of n using Recursion (Public Method)
```
public static int factorialUsingRecursion(int n) {
    if (n == 0 || n == 1) {
        return 1; // Base case for factorial
    }
    return n * factorialUsingRecursion(n - 1); // Recursive call
}
```
This method calculates the factorial of a number n using recursion. The recursion continues multiplying n by n-1 until the base case (n = 0 or n = 1) is reached.

## Task 9: Print Numbers from 1 to 10 Without Using Loops (Default Method)
```
static void printNumbersWithoutLoop(int start) {
    if (start <= 10) {
        System.out.print(start + " ");
        printNumbersWithoutLoop(start + 1); // Recursive call
    }
}
```
This method prints numbers from 1 to 10 without using a loop. It uses recursion, calling the method with an incremented value of start until it reaches 10.

## Main Method Execution
```
public static void main(String[] args) {
    printDivisiblesOf5();
    sumFrom50To1();
    printAlphabets();
    printAsciiCodes();
    int numberForTable = 5;
    printMultiplicationTable(numberForTable);
    int n = 10;
    System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));
    int factorialNum = 5;
    System.out.println("Factorial of " + factorialNum + " using while loop is: " + factorialUsingWhileLoop(factorialNum));
    System.out.println("Factorial of " + factorialNum + " using recursion is: " + factorialUsingRecursion(factorialNum));
    printNumbersWithoutLoop(1);
}
```

The `main` method in this program calls each of the tasks described above and prints the corresponding output. The following methods are executed in sequence:

1. **`printDivisiblesOf5()`**: Prints all numbers divisible by 5 from 1 to 100.
2. **`sumFrom50To1()`**: Calculates and prints the sum of numbers from 50 to 1.
3. **`printAlphabets()`**: Prints the alphabets from A to Z.
4. **`printAsciiCodes()`**: Prints the ASCII codes for alphabets from A to Z.
5. **`printMultiplicationTable()`**: Prints the multiplication table for a given number.
6. **`sumOfNaturalNumbers()`**: Calculates and prints the sum of the first `n` natural numbers.
7. **`factorialUsingWhileLoop()`**: Calculates and prints the factorial of a number using a while loop.
8. **`factorialUsingRecursion()`**: Calculates and prints the factorial of a number using recursion.
9. **`printNumbersWithoutLoop()`**: Prints numbers from 1 to 10 without using loops (using recursion).

Each method is executed in sequence, and the output is displayed for each respective task.

---
