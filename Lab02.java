/*
 * Written by Isabelle Boyd Jackson
 */
import java.util.Scanner;
public class Lab02 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a positive number to generate a corresponding triangle made of stars.");
		int input = keyboard.nextInt();
		keyboard.nextLine();
		
		if (input <= 0) 
		{
			if (input == 0) 
			{ 
				System.out.println("You can't make a triangle with no stars!");
				System.exit(0);
			}
			System.out.println("Sorry, that's not a positive number!");
			System.exit(0);
		} 
			
		String a = "*";
		int i = 0;
		System.out.println(a);
		while(i < input-1) 
		{
			a+="*";
			i++;
			System.out.println(a);
		}
		
		while(i > 0) 
		{
			String subA = a.substring(0,i);
			System.out.println(subA);
			i = i-1;
		}

		System.out.println("\nI hope you enjoy your new triangle!");
		
		keyboard.close();
	}

}