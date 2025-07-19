package sampleGame;

import java.lang.Math;
import java.util.Scanner;

public class NumberGuessing {
	public void numGuess() {
		Scanner sc = new Scanner(System.in);
		int choose = (int) (Math.random()*100) + 1;
		
		
		
		System.out.println("I have choosen a number (1-100).");
		System.out.println("Try to guess it!!!");
		
		
		int flag = 0;
		int guess;
		while(true) {
			System.out.print("Enter your guess: ");
			guess = sc.nextInt();
			flag++;
			if(guess < choose) {
				System.out.println("Too low!!");
			}
			
			else if(guess > choose) {
				System.out.println("Too high!!");
			}
			
			else {
				System.out.printf("Correct! You guessed it in %d attempts", flag);
				break;
			}
		}
		sc.close();
	}
}
