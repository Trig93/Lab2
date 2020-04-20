package day1;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userInt;
		String userName;
		
		System.out.println("Please enter your name");
		userName = userInput.nextLine();
		
		System.out.println(userName + ", please enter a number between 1-100:");
		userInt = userInput.nextInt();
		
		if (userInt < 1) {
			System.out.println("Sorry " + ", " + userInt + " is not a valid entry. Please try again.");
			System.out.println("");
		}
		else if ((userInt >= 1) && (userInt <= 59) && ((userInt % 2) != 0)) {
			System.out.println(userInt + " Odd.");
		}
		else if ((userInt >= 1) && (userInt <= 25) && ((userInt % 2) == 0)) {
			System.out.println(userInt + " is an even number and less than 25.");
		}
		else if ((userInt >= 26) && (userInt <= 60) && ((userInt % 2) == 0)) {
			System.out.println("Even.");
		}
		else if ((userInt >= 62) && (userInt <= 100) && ((userInt % 2) == 0)) {
			System.out.println(userInt + " Even.");
		}
		else if ((userInt >= 61) && (userInt <= 99) && ((userInt % 2) != 0)) {
			System.out.println(userInt + " is an odd number and over 60.");
		}
		else if (userInt > 100) {
			System.out.println("Sorry " + ", " + userInt + " is not a valid entry. Please try again.");
			System.out.println("");
		}
		
		System.out.println("Thanks for playing " + userName + "!");
		userInput.close();

	}

}
