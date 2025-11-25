/*
 * Written by Isabelle Boyd Jackson
 */
import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// Set up the array with size 10
		double[] entries = new double[10];
		int i = 0;
		// Create a loop that collects the user's input and assigns to index
		for(i=0;i < entries.length; i++) {
			System.out.println("Enter a temperature for Day "+(i+1));
			entries[i] = (double)keyboard.nextDouble();
		}
		double sum = 0.0;
		int j = 0;
		// Creates a loop that adds the indices together
		for(j = 0; j < entries.length; j++) {
		sum = sum + entries[j];
		}
		// Sets the average as the sum divided by the length
		double average = sum/entries.length;
		System.out.println("The average of temperatures is "+average);
		int k = 0;
		System.out.println("The days below have a below-average temperature:");
		// Creates a loop that checks if the index values are less than the average. Then, it prints the values.
		for (k = 0; k < entries.length; k++) {
			if(entries[k] < average) {
				System.out.println("Day "+(k+1)+" had a temperature of "+entries[k]);
			}
		}
		
		keyboard.close();
	}

}
