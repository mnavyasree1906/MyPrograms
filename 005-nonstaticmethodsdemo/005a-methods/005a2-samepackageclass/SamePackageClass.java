package methods;

public class SamePackageClass {

    public static void main(String[] args) {
        // Create an object of MyClass
    	NonStaticMethod obj = new NonStaticMethod();

        // Access non-static variables
        // System.out.println("Private Variable: " + obj.privateVar); // Not allowed (private) Cannot be accessed outside MyClass because it’s private
        System.out.println("Default Variable: " + obj.defaultVar);    // Allowed (same package)  Can be accessed since SamePackageClass is in the same package
        System.out.println("Protected Variable: " + obj.protectedVar); // Allowed (same package) Can be accessed within the same package.
        System.out.println("Public Variable: " + obj.publicVar);       // Allowed (public) Can be accessed from anywhere.
    }
}
