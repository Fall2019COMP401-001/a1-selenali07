package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your Java version: " + System.getProperty("java.version"));
		
		// Your code follows here.
		String [] produce;
		
		int count = scan.nextInt();
		
		produce = new String[count];
		
		for(int i = 0; i < count; i++) {
			
			int price = scan.nextInt();

			int people = scan.nextInt();
			
			customers = new String[people];
			
			for(int j = 0; j < people; j++) {
					
				String firstName = scan.next();
					
				String lastName = scan.next();
					
				int items = scan.nextInt();
					
				double cost = 0;
					
				for(int p = 0; p < items; p++) {
						
					int amount = scan.nextInt();
						
					String name = scan.next();
						
					double price = scan.nextDouble();
						
					cost += amount * price;
					
				}
	
		produce[j] = firstName + ". " + lastName + ": " + String.format("%.2f", cost);
			
		}
		
		for (int i=0; i<produce.length; i++) {
			
			System.out.println(produce[i]);
	
}
	
	System.out.println("Biggest: " + biggest);
	System.out.println("Smallest: " + smallest);
	
	
	static int findValueMax(int[] price) {
		
		int cur_max = vals[0];
		for (int i=1; i < .length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	}

	
	scan.close();
		}
	}
	}




