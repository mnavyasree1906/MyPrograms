package anotherpackage;

import static methods.StaticMethodDemo.*;

public class AnotherClassAccessDirectly {
    public static void main(String[] args) {
        // Accessing static variables directly
        System.out.println("s: " + s);
        System.out.println("c: " + c);
        System.out.println("t: " + t);
        System.out.println("L: " + L);

        // Calling static methods directly
        divison();
        swapWithoutThirdVariable(25, 40);
        double randVal = getRandomDoubleData();
        System.out.println("Random value: " + randVal);
    }

	}