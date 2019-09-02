package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] customers = new String[count];
		// first for loop cycles through the name and items of the customer
		for(int i = 0; i < count; i++) {
			char firstName = scan.next().charAt(0);
			String lastName = scan.next();
			int items = scan.nextInt();
			double cost = 0;
		// nested for loop calculates the customers product total
			for(int j = 0; j < items; j++) {
				int amount = scan.nextInt();
				String product = scan.next();
				double price = scan.nextDouble();
				cost += amount * price;
			
			}
			// the customer string array is used to keep track of and print out the results
			customers[i] = firstName + ". " + lastName + ": " + String.format("%.2f", cost);
		}
		
		for (int i=0; i<customers.length; i++) {
			
			System.out.println(customers[i]);
			
		}
		scan.close();
	}
	
}
