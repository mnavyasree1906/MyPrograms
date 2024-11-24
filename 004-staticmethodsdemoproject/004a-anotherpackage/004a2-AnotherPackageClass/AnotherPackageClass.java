package anotherpackage;

import methods.StaticMethodDemo;

public class AnotherPackageClass {
    public static void main(String[] args) {
        // Accessing static variables from StaticMethodsDemo
        System.out.println("s: " + StaticMethodDemo.s);
        System.out.println("c: " + StaticMethodDemo.c);
        System.out.println("t: " + StaticMethodDemo.t);
        System.out.println("L: " + StaticMethodDemo.L);

        // Calling static methods from StaticMethodDemo
        StaticMethodDemo.divison();
        StaticMethodDemo.swapWithoutThirdVariable(25, 40);
        double randVal = StaticMethodDemo.getRandomDoubleData();
        System.out.println("Random value: " + randVal);
    }
}