/*
 * Class: CMSC203 CNR 46622 
 * Instructor: Prof.Grigoriy A. Grinberg
 * Description: (This program gets random numbers between 0 and 100  from RNG.java and  ask
					you to guess the random number)
 * Due: 07/03/2022
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ABAYNEH MENGISTU
*/

import java.util.Scanner;

public class RandomNumberGuesser
{	
	/*
	This program gets random numbers between 0 and 100  from RNG.java and  ask
	you to guess the random number.the program narrows down choices according to
	the the low and high guesses.
	*/

  public static void main(String[] args) 
	{

		int randNum;
		int nextGuess=0;
		String input = null;
		
		
// This do while loop is used to continue playing until the player say no.  		
		
do
{
	
	
// Initializing low and high Guess.
		
		int highGuess = 100;
		int lowGuess = 0;
		int numberOfGuesses = 0;
		
	// this code gets  random number
		
		 RNG rand = new RNG();
		 int x = rand.getX();		
		randNum = x;
		
// this while loop exit the loop when the guessed number is the same as the RNG number.
		
while (randNum != nextGuess)	
		
	{

	
// this code asks the user to guess the first number.
	
	if (numberOfGuesses == 0)
	{
		System.out.println("Enter your first guess: ");
	}
// creating a scanner object to get input from keyboard.

	Scanner keyboard = new Scanner(System.in);	
	
		nextGuess = keyboard.nextInt();
 	
// this code counts the number of trials.
			
	numberOfGuesses++;

/*
 * This if statement congratulate if the random number is the same
 as the guessed number and ask the user to play again
 */
		if (randNum == nextGuess  )
			
			{
				
				System.out.println("Congratulation, You guessed correctly ");
				System.out.println("Number of Guesses is: " + numberOfGuesses);					
				System.out.println("Try again? (yes or no) ");			
			}
							
				
// this else if statement validates the nextGuess in the range between lowGuess and highGuess.
			
			  else if (nextGuess <= lowGuess || nextGuess >= highGuess)
				{
					System.out.println(">>> Guess must be between "+ lowGuess  + " and "+ highGuess +". Try again ");
					
				}
			
//	This else if statement checks if the random number greater than the guessed number.	
			
				else if(randNum > nextGuess)
				{
					System.out.println("Your guess is too low");					
					System.out.println("Number of guesses is: " + numberOfGuesses);
					lowGuess = nextGuess;
					System.out.println("Enter the next guess between "+ lowGuess + " and " + highGuess );
						
				}			
//	This else if statement checks if the random number less than the guessed number.
		
				else if (randNum < nextGuess)
				{
					System.out.println("Your guess is too high");
					System.out.println("Number of guesses is: " + numberOfGuesses);
					highGuess = nextGuess;
					System.out.println("Enter the next guess between "+ lowGuess + " and " + highGuess);

				}
			
		}

//creating a scanner object to get a yes/no input from keyboard.

		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		System.out.print("\n");
		
	}


while (input.equalsIgnoreCase("yes"));

	System.out.print("Thank you for playing ...");
}
	
}
