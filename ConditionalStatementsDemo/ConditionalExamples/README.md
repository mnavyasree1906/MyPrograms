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

