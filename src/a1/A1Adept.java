package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int count = scan.nextInt();
		
		String [] produce = new String[count];
		
		double[] price = new double[count];
		
		for(int i = 0; i < count; i++) {

			String prod = scan.next();
			
			double cost = scan.nextDouble();
			
			produce[i] = prod;
			
			price[i] = cost;
			
		}
		
		int customerCount = scan.nextInt();
		
		// declared values for the three requirements
		
		double biggest = 0;
		
		double smallest = -1;
		
		double average = 0;
		
		String biggestTotalName = "";
		String smallestTotalName = "";
			
		for(int j = 0; j < customerCount; j++) {
					
			String firstName = scan.next();
					
			String lastName = scan.next();
					
			int num = scan.nextInt();
			
			double totalCost = 0;
					
			for(int p = 0; p < num; p++) {
						
				int quantity = scan.nextInt();
						
				String name = scan.next();
						
				for(int a = 0; a < produce.length; a++) {
					if(produce[a].equals(name)){
					totalCost += quantity * price[a]; 
					
					}
				}
			}
			// used boolean logic to cycle through the array of the produce prices
			
			if(totalCost > biggest) {
				
				biggest = totalCost;
				
				biggestTotalName = firstName + " " + lastName;
			}
			
			if(totalCost < smallest || smallest == -1) {
				smallest = totalCost;
				
				smallestTotalName = firstName + " " + lastName;
			}
		
			average += totalCost;
			
		}
	
		average = average / customerCount;

		System.out.println("Biggest: " + biggestTotalName + " (" + String.format("%.2f",biggest) + ")");
		System.out.println("Smallest: " + smallestTotalName + " (" + String.format("%.2f", smallest) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	scan.close();
		
	}
	}




