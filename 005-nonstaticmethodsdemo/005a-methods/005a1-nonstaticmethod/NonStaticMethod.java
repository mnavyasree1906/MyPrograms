package methods;

public class NonStaticMethod {

	    // Non-static variables with different access modifiers
	    private int privateVar = 10;        // Private access -Accessible only within the class.
	    int defaultVar = 20;                // Default access -Accessible only within the same package.
	    protected int protectedVar = 30;    // Protected access -Accessible within the same package and subclasses in other packages.
	    public int publicVar = 40;          // Public access -Accessible from anywhere.

	    // Non-static method to display all variables in the same class
	    public void displayVariables() {
	        System.out.println("Private Variable: " + privateVar);
	        System.out.println("Default Variable: " + defaultVar);
	        System.out.println("Protected Variable: " + protectedVar);
	        System.out.println("Public Variable: " + publicVar);
	    }

	    public static void main(String[] args) {
	        // Accessing non-static variables inside the same class
	    	NonStaticMethod obj = new NonStaticMethod();
	        obj.displayVariables();
	    }
	}
