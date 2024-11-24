package otherpackage;

import methods.NonStaticMethod;  // Import the MyClass from the correct package

public class DifferentPackageClass {

    public static void main(String[] args) {
        // Create an object of MyClass from another package
    	NonStaticMethod obj = new NonStaticMethod();
    	
        // System.out.println("Private Variable: " + obj.privateVar);  // Not allowed (private)
        // System.out.println("Default Variable: " + obj.defaultVar);  // Not allowed (package-private)
        // System.out.println("Protected Variable: " + obj.protectedVar); // Not allowed (protected, but not a subclass)
        System.out.println("Public Variable: " + obj.publicVar);       // Allowed (public)
    }
}
