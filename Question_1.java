package assignment;

// import the scanner to take user input
import java.util.Scanner;

public class Question_1 {
	
//	Create the main class that will run the reverse
	public static void main(String[] args) {
		
//		Assign a variable to the scanner
		Scanner User = new Scanner(System.in);
		
//		Give the user an info regarding the range of the number 
		System.out.println("Input any number, from 2 digits upward: ");
		
//		assign a variable with the data type of long, in order to avoid having input larger than int
		long input = User.nextLong();
		
//		Print out the user input
		System.out.println("Your inputed number is "+ input);
		
//		Print out the reversed input 
		System.out.print("The reverse is: ");
		
//		call the reverse method
		reverse(input);
	
	}
	
//	create a method for reversing the input
	static long reverse(long input) {
		
//		Assign a variable to the reversed long and set it to zero
		long reversed = 0;
		
//		a loop that satistified when the list isnt zero
		while(input!=0) {
			
//			The reversed is compute in such a way that the modulus of the input when divided by ten
//			is assigned to reversed eg. 234/10 = 23 remainder 4, 23 divided by 10 is 2 remainder by 3 while 2 divided by 10 is 0 remainder 2
//			so the remainder put together are assigned to the reversed variable
			reversed = input%10;
			
//			divide the input by 10
			input = input/10;
			
			
//			print out the reversed 
			System.out.print(reversed);
			
//          check if the input when reversed is greater than the maximum a long can take or lesser
			if(reversed > Long.MAX_VALUE || reversed < Long.MIN_VALUE) {
				
//				if the condition is met, return zero to the user
				return 0;
			}
			
			}
		
//		return the input
		return input;
	}
}
