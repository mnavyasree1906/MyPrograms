package methods;

public class StaticMethodDemo {
	// Static variables are defined here:
	public static String s = "static method demo";  // A private static string variable (used inside this class)
	public static char c = 'b';                            // A static character variable 
	public static int t = 10;                   // A protected static integer variable (used in this class and by subclasses)
	public static long L = 50L;                   // A public static long variable ( accessed from anywhere)
	public static float fahrenheitTemp;


    /**
     * Static method with void return type and no parameters
     * accessmodifier static void methodname() { logic }
     */
	//divison() Method:
	public static void divison() {
	    System.out.println("started executing the division...");
	    
	    // We define two local variables:
	    byte bt = 2;  // A small number
	    short sh = 7; // A slightly bigger number
	    
	    // Calculate the remainder of (c + t + L) divided by (bt + sh)
	    long reminder = (c + t + L) % (bt + sh);
	    System.out.println("(c + t + L) % (bt + sh) expression output: " + reminder);
	    
	    // Calculate the quotient (how many times sh fits into (L - t - c - bt))
	    long qtVal = (L - t - c - bt) / sh;
	    System.out.println("quotient value is: " + qtVal);

	    System.out.println("********** end of division **********");
	}
    
    /**
     * static method with void with parameters
     * accessmodifier static void methodname(datatype p1, datatype p2){logic}
     * write a program to swap given two integers without third variable
     */
	//Swapping Two Numbers Without a Third Variable
	public static void swapWithoutThirdVariable(int a, int b) {
	    System.out.println("Before swapping a = " + a + " b = " + b);
	    
	    // Step 1: Add a and b
	    a = a + b;

	    // Step 2: Subtract new b value from the new a value and assign to b
	    b = a - b;

	    // Step 3: Subtract new b value from new a value and assign to a
	    a = a - b;

	    System.out.println("After swapping a = " + a + " b = " + b);
	}

    
    /**
     * static method without void without parameters
     * accessmodifier static datatype methodname() {logic; return value;}
     * write a program to return the random double value
     */
	//Getting a Random Double Number
	public static double getRandomDoubleData() {
	    System.out.println("started executing the getRandomDoubleData...");
	    
	    // Math.random() generates a random number between 0 and 1
	    double randVal = Math.random();
	    
	    return randVal;  // Return the random number
	}

    
    public class TemperatureConversion {
    	
    	//Converting Celsius to Fahrenheit
        protected static float convertCelciusTempToFarenheitTemp(float ct) {
            System.out.println("Started executing the convertCelciusTempToFarenheitTemp(float ct)...");
            float ft = (float) ((ct * 10.5) + 45);
            return ft;
        }

        public static void main(String[] args) {
            float celsiusTemp = 30.0f; // Example Celsius temperature
            float fahrenheitTemp = convertCelciusTempToFarenheitTemp(celsiusTemp);
            System.out.println("Fahrenheit temperature: " + fahrenheitTemp);
        }
    }
    
    
		public static void main(String[] args) {
		    // Q) How can you call static void method under main method/anystaticmethod in the same class?
		    // Ans) staticmethodname();

			// Call the division method
		    divison();

		    // Q) how can you call static void parameterized method under main() in same class?
		    // Ans) staticmethodname(plvalue, p2value, p3value..);
		    
		    // Call the swap method with 15 and 60
		    swapWithoutThirdVariable(15, 60);

		    // Q) how can you call return type static method() under main() in the same class?
		    // datatypeofthemethod varaiblename=returntypestaticmethod();
		    
		    // Call the method to get a random double number
		    double randV1 = getRandomDoubleData();
		    System.out.println("random double value is: " + randV1);

		    // how to call returntype static method in printstatement?
		    // Ans) System.out.println("value is" + returntypestaticmethod());
		    
		    // Call the temperature conversion method
		    float fahrenheitTemp = convertCelciusTempToFarenheitTemp(60.5F);
		    System.out.println("Fahrenheit temperature is: " + fahrenheitTemp);

		}

		public static float convertCelciusTempToFarenheitTemp(float f) {
			// TODO Auto-generated method stub
			return 0;
			
		}


		}


