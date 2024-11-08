package example.conditionalstatements;

public class ConditionalExamples {

	// Static Methods
		/**
		 * accessmodifier static Void methodName(){logic}
		 */
	
	    // 1. Public Method: Check if the temperature is hot or normal using If
	    public void checkTemperature(int temperature) {
	        // Logic: Check if the temperature exceeds a certain threshold (25 degrees).
	        if (temperature > 25) {
	            System.out.println("It's hot outside.");
	        }
	        // If the temperature is not greater than 25, nothing happens (no else case).
	    }

	    // 2. Private Method: Check grade performance using If-Else
	    private void checkGrade(int marks) {
	        // Logic: Determine pass or fail based on marks.
	        if (marks >= 50) {
	            System.out.println("You passed the exam.");
	        } else {
	            // If marks are less than 50, the else block executes.
	            System.out.println("You failed the exam.");
	        }
	    }

	    // 3. Protected Method: Age category using Nested If-Else
	    protected void ageCategory(int age) {
	        // Logic: Classify based on age using nested if-else.
	        if (age <= 12) {
	            System.out.println("Child.");
	        } else if (age <= 60) {
	            System.out.println("Adult.");
	        } else {
	            // If age is greater than 60, the else block executes.
	            System.out.println("Senior.");
	        }
	    }

	    // 4. Default Method using Switch to assign grade
	    void assignGrade(int marks) {
	        String grade; // Variable to hold the grade
	        // Logic: Assign grade based on marks divided by 10 to determine the grade category.
	        switch (marks / 10) {
	            case 10: // Case for perfect score (100)
	            case 9:  // Case for 90-99
	                grade = "A"; 
	                break; // Exit the switch
	            case 8:  // Case for 80-89
	                grade = "B"; 
	                break; // Exit the switch
	            case 7:  // Case for 70-79
	                grade = "C"; 
	                break; // Exit the switch
	            case 6:  // Case for 60-69
	                grade = "D"; 
	                break; // Exit the switch
	            default: // If none of the above cases match (marks < 60)
	                grade = "F"; 
	                break; // Exit the switch
	        }
	        System.out.println("Grade: " + grade); // Output the assigned grade
	    }



	public static void main(String[] args) {
		
		ConditionalExamples conditions = new ConditionalExamples();

		conditions.checkTemperature(30);    // Public Method: If Statement
		conditions.checkGrade(85);          // Private Method: If-Else Statement
		conditions.ageCategory(45);         // Protected Method: Nested If-Else
	    conditions.assignGrade(88);         // Default Method: Switch to Assign Grade
    }
	}

