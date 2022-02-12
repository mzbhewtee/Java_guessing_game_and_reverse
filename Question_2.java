package assignment;

// import the random package that will randomly generate number
import java.util.Random;
import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		call the random function and assign a variable to it
		Random number  = new Random();
		
//		assign the data type to the digit to be guessed
		int guess;
		
//		Set the range of number to be guessed and add one to it in order for the range to be from 1
		guess = 1 + number.nextInt(30);
//		System.out.println(guess); //Check if the number to be guessed to know if the code realy works
		
//		call the scanner and assign a variable to it
		Scanner UserInput = new Scanner(System.in);
		
//		Assign a variable to the trial
		int trial = 0;
		
//		Use while loop and assign true to it since it will always be true regardless of the number
		while(true) {
			
//			print an instruction to the user
			System.out.println("Guess a number between 0 and 30");
			
//			assign a variable to the digit guessed
			int guessed_number = UserInput.nextInt();
			
//			Increase the trial time as the user keeps guessing
			trial++;
			
//			Check if the user guessed number is correct
			if (guessed_number == guess) {
				
//				if correct print out an info to the user
				System.out.println("Matching");
				
//				print out the trial times as the user guessed the right number
				System.out.println("You did it in " + trial + " trials");
				
//				break the loop and stop the program
				break;
		}	
//			code to check if the guessed number is lesser than the number to be guessed
			else if(guessed_number < guess){
				
//				if lower print an info to the user and continue the program
				System.out.println("Too low, try again");
			}
			
//			check if the guessed number is higher than the number
			else {
				
//			if higher, print an info to the user and continue the program
				System.out.println("Too high, try again");
		}
	}
	}

}
