package example.conditionalstatements;

public class DemoWhileLoop {


	    // Task 1: Print numbers divisible by 5 from 1 to 100 - public method
	    public static void printDivisiblesOf5() {
	    	System.out.println("Task 1: Numbers divisible by 5 from 1 to 100");
	        int i = 1;
	        System.out.println("Numbers divisible by 5 from 1 to 100:");
	        while (i <= 100) {
	            if (i % 5 == 0) {
	                System.out.print(i + " ");
	            }
	            i++;
	        }
	        System.out.println("\n**************************************");
	    }

	    // Task 2: Print the sum of numbers from 50 to 1 - default (package-private) method
	    static void sumFrom50To1() {
	    	System.out.println("Task 2: Sum from 50 to 1");
	        int i = 50;
	        int sum = 0;
	        while (i >= 1) {
	            sum += i;
	            i--;
	        }
	        System.out.println("Sum of numbers from 50 to 1 is: " + sum);
	        System.out.println("**************************************");
	    }

	    // Task 3: Print alphabets from A to Z - private method
	    private static void printAlphabets() {
	    	 System.out.println("Task 3: Alphabets from A to Z");
	        char letter = 'A';
	        System.out.println("Alphabets from A to Z:");
	        while (letter <= 'Z') {
	            System.out.print(letter + " ");
	            letter++;
	        }
	        System.out.println("\n**************************************");
	    }

	    // Task 4: Print ASCII codes from A to Z - protected method
	    protected static void printAsciiCodes() {
	    	 System.out.println("Task 4: ASCII codes from A to Z");
	        char letter = 'A';
	        System.out.println("ASCII codes for A to Z:");
	        while (letter <= 'Z') {
	            System.out.println( letter + (int) letter);
	            letter++;
	        }
	        System.out.println("**************************************");
	    }

	    // Task 5: Print multiplication table of a number - public method
	    public static void printMultiplicationTable(int num) {
	    	System.out.println("Task 5: Multiplication Table");
	        int i = 1;
	        System.out.println("Multiplication Table for " + num + ":");
	        while (i <= 10) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	            i++;
	        }
	        System.out.println("**************************************");
	    }

	    // Task 6: Sum of first n natural numbers - private method
	    private static int sumOfNaturalNumbers(int n) {
	    	
	        int sum = 0;
	        int i = 1;
	        while (i <= n) {
	            sum += i;
	            i++;
	        }
	        return sum;
	    }

	    // Task 7: Factorial of n using a while loop - protected method
	    protected static int factorialUsingWhileLoop(int n) {
	        int fact = 1;
	        int i = 1;
	        while (i <= n) {
	            fact *= i;
	            i++;
	        }
	        return fact;
	    }

	    // Task 8: Factorial of n using recursion - public method
	    public static int factorialUsingRecursion(int n) {
	        if (n == 0 || n == 1) {
	            return 1; // Base case for factorial
	        }
	        return n * factorialUsingRecursion(n - 1); // Recursive call
	    }

	    // Task 9: Print numbers from 1 to 10 without using loops - default (package-private) method
	    static void printNumbersWithoutLoop(int start) {
	        if (start <= 10) {
	            System.out.print(start + " ");
	            printNumbersWithoutLoop(start + 1); // Recursive call
	        }
	    }

	    public static void main(String[] args) {
	        // Execute each task

	        
	        printDivisiblesOf5();

	        
	        sumFrom50To1();

	       
	        printAlphabets();

	       
	        printAsciiCodes();

	        
	        int numberForTable = 5; // Choose any number for multiplication table
	        printMultiplicationTable(numberForTable);

	        System.out.println("Task 6: Sum of first n natural numbers");
	        int n = 10;
	        System.out.println("Sum of first " + n + " natural numbers is: " + sumOfNaturalNumbers(n));

	        System.out.println("Task 7: Factorial using while loop");
	        int factorialNum = 5;
	        System.out.println("Factorial of " + factorialNum + " using while loop is: " + factorialUsingWhileLoop(factorialNum));

	        System.out.println("Task 8: Factorial using recursion");
	        System.out.println("Factorial of " + factorialNum + " using recursion is: " + factorialUsingRecursion(factorialNum));

	        System.out.println("Task 9: Numbers from 1 to 10 without using loops");
	        printNumbersWithoutLoop(1);
	    }
	}
