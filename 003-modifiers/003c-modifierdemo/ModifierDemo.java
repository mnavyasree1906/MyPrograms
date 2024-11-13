package modifierdemo;  // Ensure this is at the top

public class ModifierDemo {
    public int publicVar = 10;    // Can be accessed from anywhere
    private int privateVar = 12;  // Can be accessed only within this class
    protected int protectedVar = 13; // Can be accessed within this class and subclasses
    int defaultVar = 14; // Accessible only within the same package

    public void publicMethod() {
        System.out.println("This is a public method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    void defaultMethod() {
        System.out.println("This is a default method");
    }
}
