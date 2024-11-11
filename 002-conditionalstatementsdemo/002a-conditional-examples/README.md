# ConditionalExamples Class

The `ConditionalExamples` class demonstrates different types of conditional statements in Java. It includes methods with `if`, `if-else`, nested `if-else`, and `switch` statements to handle various scenarios based on input values. Below is a breakdown of each method and its purpose.

## Class Overview

This class showcases various conditional statements and access modifiers:

- **Public**: Accessible from any class.
- **Private**: Only accessible within the same class.
- **Protected**: Accessible within the same package or subclasses.
- **Default** (no modifier): Accessible within the same package.

These methods are useful for basic control flow handling and demonstrate how to categorize data based on conditions.

## Methods

### 1. `checkTemperature(int temperature)` - Public Method: If Statement

This method checks whether a given temperature is considered "hot."

- **Logic**: Uses an `if` statement to determine if the temperature exceeds 25 degrees.
- **Output**: Prints `"It's hot outside."` if the temperature is greater than 25. If not, nothing is printed.

```java
public void checkTemperature(int temperature) {
    if (temperature > 25) {
        System.out.println("It's hot outside.");
    }
}
```

### 2. `checkGrade(int marks)` - Private Method: If-Else Statement
This method checks whether a student passed or failed based on their marks.

- **Logic**: Uses an if-else statement to determine if marks are 50 or higher.
- **Output**: Prints "You passed the exam." if marks are 50 or above, otherwise prints "You failed the exam."

## If-Else Statement Example

To check if a student passed or failed based on marks:

```java
private void checkGrade(int marks) {
    if (marks >= 50) {
        System.out.println("You passed the exam.");
    } else {
        System.out.println("You failed the exam.");
    }
}
```

### 3. `ageCategory(int age)` - Protected Method: Nested If-Else Statement
This method categorizes an individual based on their age.

- **Logic**: Uses nested if-else statements to determine if a person is a "Child" (age <= 12), an "Adult" (age between 13 and 60), or a "Senior" (age > 60).
- **Output**: Prints the age category based on the provided age.
```java
protected void ageCategory(int age) {
    if (age <= 12) {
        System.out.println("Child.");
    } else if (age <= 60) {
        System.out.println("Adult.");
    } else {
        System.out.println("Senior.");
    }
}
```

### 4. `assignGrade(int marks)` - Default Method: Switch Statement
This method assigns a grade (A, B, C, D, or F) based on marks.

- **Logic**: Uses a switch statement, dividing marks by 10 to categorize them. Each case corresponds to a grade category:
- A: 90 and above
- B: 80-89
- C: 70-79
- D: 60-69
- F: Below 60
- **Output**: Prints the assigned grade.
```java
void assignGrade(int marks) {
    String grade;
    switch (marks / 10) {
        case 10:
        case 9:
            grade = "A";
            break;
        case 8:
            grade = "B";
            break;
        case 7:
            grade = "C";
            break;
        case 6:
            grade = "D";
            break;
        default:
            grade = "F";
            break;
    }
    System.out.println("Grade: " + grade);
}
```

### `Main Method Example`
The main method demonstrates how to call each method in the ConditionalExamples class.
```java
public static void main(String[] args) {
    ConditionalExamples conditions = new ConditionalExamples();

    conditions.checkTemperature(30);    // Public Method: If Statement
    conditions.checkGrade(85);          // Private Method: If-Else Statement
    conditions.ageCategory(45);         // Protected Method: Nested If-Else
    conditions.assignGrade(88);         // Default Method: Switch to Assign Grade
}
```

### Output:

![image](https://github.com/user-attachments/assets/5ac6848e-fd80-4abb-baad-604de83f43bc)

---
