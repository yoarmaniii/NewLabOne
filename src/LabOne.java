//always should be at the top
import java.util.Scanner;


public class LabOne {
	

	public static void main(String[] args) {
	
	int perimeter;
			
	System.out.println("Welcome to Grand Circus' Room Detail Genarator!");
	
	System.out.println();
	
	Scanner input = new Scanner (System.in);
	
	String choice = "Yes";
	
	while (choice.equalsIgnoreCase("Yes")) {
		
		//get input from user
		System.out.println("Enter a length");
		double length = Double.parseDouble(input.nextLine());
		
		System.out.println("Enter a width");
		double width = Double.parseDouble(input.nextLine());
		
		//Multiply length and width for area
		System.out.println("area is: " + length * width);
		
		System.out.println();
		
		//add Length and width and multiply by two
		perimeter = (int) ((length + width) *2 );
		System.out.println("perimeter is: "  + perimeter);
		System.out.println();
		
		System.out.println("Continue with another? (Y/N)");
		choice = input.nextLine();
		System.out.println();
		
		
	
		
	}
		input.close();
		System.out.println("BYE");
	
			

		

	}

}
