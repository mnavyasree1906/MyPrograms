## While Loop in Java: Task Solutions

This Java program demonstrates the usage of `while` loops for printing numbers in two different sequences: from 1 to 10 and from 10 to 1.

### Methods in the Program

#### 1. Print Numbers from 1 to 10
This method prints numbers from 1 to 10 using a `while` loop.
#### Code
```java
// Protected method to print numbers from 1 to 10
protected void print1To10() {
    int i = 1; // Initialize the starting number
    while (i <= 10) { // Loop until i is less than or equal to 10
        System.out.print(i + "\t"); // Print the current i
        i++; // Increment the number by 1
    }
    System.out.println();
    System.out.println("**************************************");
}
```
#### Explanation:
- The method starts from 1 and loops until 10.
- Each number is printed followed by a tab, and the number is incremented by 1.

#### 2. Print Numbers from 10 to 1
This method prints numbers from 10 to 1 in descending order using a while loop.
#### Code
```java
// Public method to print i from 10 to 1
public void print10To1() {
    int i = 10; // Initialize the starting number
    while (i >= 1) { // Loop until i is greater than or equal to 1
        System.out.print(i + "\t"); // Print the current i value
        i--; // Decrement the number by 1
    }
}
```
#### Explanation:
- The method starts from 10 and loops until it reaches 1.
- Each number is printed followed by a tab, and the number is decremented by 1.

#### Main Method
The main method creates an instance of the WhileLoop class and calls both methods to demonstrate their functionality.
#### Code
```java
public static void main(String[] args) {
    WhileLoop wlObj = new WhileLoop(); // Create an object of the class
    System.out.println("Numbers from 1 to 10:");
    wlObj.print1To10(); // Call the protected method to print 1 to 10
    
    System.out.println("Numbers from 10 to 1:");
    wlObj.print10To1(); // Call the public method to print 10 to 1
}
```

### Output:
![image](https://github.com/user-attachments/assets/f813c2b5-095c-494d-bffd-7fd0b81b18d0)

---

