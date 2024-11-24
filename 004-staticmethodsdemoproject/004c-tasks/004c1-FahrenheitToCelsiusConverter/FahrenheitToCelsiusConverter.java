package tasks;

//We import the Scanner class to take user input
import java.util.Scanner;

public class FahrenheitToCelsiusConverter {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        // Formula: C = (F - 32) * 5 / 9
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // in console it asks to enter a Fahrenheit temperature
        System.out.print("Enter Fahrenheit temperature: ");
        double fahrenheit = scanner.nextDouble();
        
        // it Convert Fahrenheit to Celsius using the method
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        
        //  Print the Celsius temperature
        System.out.println("Temperature in Celsius: " + celsius);
        
     // Close the scanner object
        scanner.close();
    }
}
