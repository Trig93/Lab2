package day1;

import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double length;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String yes;
		
		System.out.println("Please enter your length");
		length = userInput.nextDouble();
		
		System.out.println("Please enter your width");
		width = userInput.nextDouble();
		
		System.out.println("Please enter your height");
		height = userInput.nextDouble();
		
		area = length * width;
		perimeter = (length + length) + (width + width);
		volume = length * width * height;
		System.out.println("Your area is " + area);
		System.out.println("Your perimeter is " + perimeter);
		System.out.println("Your volume is " + volume);
		
		System.out.println("Continue? y/n");
		yes = userInput.next();
		
		
		if (yes.contentEquals("y")) {
			System.out.println("Please enter your length");
			length = userInput.nextDouble();
			
			System.out.println("Please enter your width");
			width = userInput.nextDouble();
			
			System.out.println("Please enter your height");
			height = userInput.nextDouble();
			
			area = length * width;
			perimeter = (length + length) + (width + width);
			volume = length * width * height;
			System.out.println("Your area is " + area);
			System.out.println("Your perimeter is " + perimeter);
			System.out.println("Your volume is " + volume);
			
			System.out.println("Continue? y/n");
			yes = userInput.next();
		}
		else {
			System.out.println("Thanks for playing!");
		}
		

	}

}
