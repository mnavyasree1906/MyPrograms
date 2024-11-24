package tasks;

import java.util.Random;

public class RandomIntegerDemo {

    // Method to generate random integer between 1 and n
    public static int getRandomInteger(int n) {
        //We create an object of the Random class, called rand. This object will help us generate random numbers.
    	Random rand = new Random();  // Create a Random object
        
        // rand.nextInt(n) generates a random number between 1 and n 
        int randomInt = rand.nextInt(n) + 1;
        return randomInt;  // Return the random integer
    }
    
    public static void main(String[] args) {
    	//We set the value of n to 100 here. You can change this to 10, 100, or 1000 depending on your requirement.
        int n = 100;  // Set n to 100 (you can change it to 10 or 1000)
        
        // Call the method to get a random integer and print it
        //getRandomInteger(n) and pass the value of n as an argument. This will return a random integer between 1 and n, which gets stored in randomValue.
        int randomValue = getRandomInteger(n);
        
        //We print the random number to the console.
        System.out.println("Random integer between 1 and " + n + " is: " + randomValue);
    }
}
