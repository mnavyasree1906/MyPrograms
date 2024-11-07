package example.conditionalstatements;

public class WhileLoop {

    // Nonstatic Methods
	/**
	 * accessmodifier Void methodName(){logic;}
	 * Protected method to print numbers from 1 to 10
	 */
    protected void print1To10() {
        int i = 1; // Initialize the starting number

        while (i <= 10) { // Loop until i is less than or equal to 10
            System.out.print(i+"\t"); // Print the current i
            i++; // Increment the number by 1
        }
        System.out.println();
        System.out.println("**************************************");
    }

    /**
     * accessmodifier Void methodName(){logic;}
     * Public method to print i from 10 to 1
     */
    public void print10To1() {
        int i = 10; // Initialize the starting number

        while (i >= 1) { // Loop until i is greater than or equal to 1
            System.out.print(i+"\t"); // Print the current i value
            i--; // Decrement the number by 1
        }
    }

    public static void main(String[] args) {
        WhileLoop wlObj = new WhileLoop(); // Create an object of the class
        System.out.println("Numbers from 1 to 10:");
        wlObj.print1To10(); // Call the protected method to print 1 to 10
        
        
        System.out.println("Numbers from 10 to 1:");
        wlObj.print10To1(); // Call the public method to print 10 to 1
    }
}