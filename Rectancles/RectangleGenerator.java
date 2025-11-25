/*
 * Written by Isabelle Boyd Jackson
 */
import java.util.Scanner;
public class HW03 {
// Creates constant array for menu choices
public static final String[] menu = {"1. Sort rectangle area from smallest to largest", "2. Sort rectangle area from largest to smallest", "3. Get average area of rectangles", "4. Get maxiumim rectangle area", "5. Get minimum rectangle area", "6. Enter new rectangles", "0. Quit the program"}; 

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Today, we will sort rectangles.\nHow many rectangles do you want to make?");
		// Collects array size for rectangles + Error message for incorrect entry.
		int amount = keyboard.nextInt();
		keyboard.nextLine();
		if(amount  <= 0) {
			do {
			System.out.println("Please enter a positive number");
			amount = keyboard.nextInt();
			keyboard.nextLine();
			}while(amount <= 0);
		}
		// Initializes arrays and populates
		double[] length = new double[amount];
		double[] width = new double[amount];
		
		for(int i = 0; i < amount; i++) {

					System.out.println("Enter a length for rectangle "+(i+1));
					length[i] = keyboard.nextDouble();
					keyboard.nextLine();

					System.out.println("Enter a width for rectangle "+(i+1));
					width[i] = keyboard.nextDouble();
					keyboard.nextLine();	
			
			}	
		// Starts cases for menu options
		int input;
		do { 
			// Prints menu each time
			System.out.println("Pick an option below");
			for(int i = 0; i < menu.length; i++) {
				System.out.println(menu[i]);
			}
			// Collects menu choice
			input = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(input) {
			// Ascending order case
			case 1 :
				double[] area = new double[amount];
				for (int i = 0; i < amount;i++) {
					area[i] = length[i]*width[i];
				}
				boolean swap = true;
				while(swap) {
					swap = false;
					for(int i =0; i<amount-1;i++) {
						if(area[i] > area[i+1]) {
							double temp = area[i];
							area[i] = area[i+1];
							area[i+1] = temp;
							swap = true;
						}
					}
				}
				for(int i = 0;i<amount;i++) {
					System.out.println(area[i]);
				}
				break;
			// Descending order case
			case 2 : 
				double[] area2 = new double[amount];
				for (int i = 0; i < amount;i++) {
					area2[i] = length[i]*width[i];
				}
				boolean swap2 = true;
				while(swap2) {
					swap2 = false;
					for(int i = 0; i<amount-1;i++) {
						if(area2[i] < area2[i+1]) {
							double temp = area2[i];
							area2[i] = area2[i+1];
							area2[i+1] = temp;
							swap2 = true;
						}
					}
				}
				for(int i = 0;i<amount;i++) {
					System.out.println(area2[i]);
				}
				break;
			// Average area case
			case 3 :
				double[] area3 = new double[amount];
				for (int i = 0; i < amount;i++) {
					area3[i] = length[i]*width[i];
				}
				double sum = 0.0;
				for(int i = 0; i < area3.length; i++) {
					sum = sum + area3[i];
					}
				double average = sum/area3.length;
				System.out.println("The average is "+average);
				break;
			// Maximum area case
			case 4 :
				double[] area4 = new double[amount];
				for (int i = 0; i < amount;i++) {
					area4[i] = length[i]*width[i];
				}
				boolean swap3 = true;
				while(swap3) {
					swap3 = false;
					for(int i = 0; i<amount-1;i++) {
						if(area4[i] < area4[i+1]) {
							double temp = area4[i];
							area4[i] = area4[i+1];
							area4[i+1] = temp;
							swap3 = true;
						}
					}
				}
					System.out.println("The maximum rectangle area is "+area4[0]);
				break;
			// Minimum area case
			case 5 :
				double[] area5 = new double[amount];
				for (int i = 0; i < amount;i++) {
					area5[i] = length[i]*width[i];
				}
				boolean swap4 = true;
				while(swap4) {
					swap4 = false;
					for(int i = 0; i<amount-1;i++) {
						if(area5[i] > area5[i+1]) {
							double temp = area5[i];
							area5[i] = area5[i+1];
							area5[i+1] = temp;
							swap4 = true;
						}
					}
				}
					System.out.println("The minimum rectangle area is "+area5[0]);
				break;
			// Reset rectangle amount and values
			case 6 :
				System.out.println("Today, we will sort rectangles.\nHow many rectangles do you want to make?");
				amount = keyboard.nextInt();
				keyboard.nextLine();
				length = new double[amount];
				width = new double[amount];
				
				for(int i = 0; i < amount; i++) {

							System.out.println("Enter a length for rectangle "+(i+1));
							length[i] = keyboard.nextDouble();
							keyboard.nextLine();

							System.out.println("Enter a width for rectangle "+(i+1));
							width[i] = keyboard.nextDouble();
							keyboard.nextLine();	
					
					}
				break;
			// Quit program
			case 0 :
				System.out.println("Have a great day. Goodbye!");
				System.exit(0);
			// Invalidates any value other than 0-6 and continues code
			default : 
				System.out.println("That's invalid! Try again!");
			}
		}while(input != 0);
	
		keyboard.close();

	}

}
