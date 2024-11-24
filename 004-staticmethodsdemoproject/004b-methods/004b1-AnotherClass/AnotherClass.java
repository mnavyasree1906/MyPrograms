package methods;

public class AnotherClass {
    public static void main(String[] args) {
        // Accessing static variables from StaticMethodsDemo
        System.out.println("s: " + StaticMethodDemo.s);
        System.out.println("c: " + StaticMethodDemo.c);
        System.out.println("t: " + StaticMethodDemo.t);
        System.out.println("L: " + StaticMethodDemo.L);

        // Calling static methods from StaticMethodsDemo
        StaticMethodDemo.divison();
        StaticMethodDemo.swapWithoutThirdVariable(25, 40);
        double randVal = StaticMethodDemo.getRandomDoubleData();
        System.out.println("Random value: " + randVal);

        // Creating an instance of the nested class
        StaticMethodDemo staticMethodsDemoInstance = new StaticMethodDemo();
        StaticMethodDemo.TemperatureConversion tempConv = staticMethodsDemoInstance.new TemperatureConversion();

        // Calling the nested class's static method
        float fahrenheitTemp = tempConv.convertCelciusTempToFarenheitTemp(30.0f);
        System.out.println("Fahrenheit temperature: " + fahrenheitTemp);
    }
}