package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		int numOfItems = scan.nextInt();
		String [] produce = new String[numOfItems];
		double[] price = new double[numOfItems];
		// this for loop takes in the data of each product in the grocery cart
		for(int i = 0; i < numOfItems; i++) {
			String prod = scan.next();
			double cost = scan.nextDouble();
			/* arrays are established in order to store  
			 * the data to keep track of each items specific name and price 
			 */
			produce[i] = prod;
			price[i] = cost;
			
		}
		
		int customerCount = scan.nextInt();
		int totalQuantity [] = new int[numOfItems];
		int purchasedItems [] = new int[numOfItems];
		
		// this for loop keeps track of each customers data

		for(int i = 0; i < customerCount; i++) {
			String firstName = scan.next();
			String lastName = scan.next();	
			int num = scan.nextInt();
			double total = 0;
			String[] s = new String[num];
			
			/* the series of for loops below cycles through the specific customer 
			 * found in the loop below in order to keep track of quantity
			 */
					
			for(int p = 0; p < num; p++) {
				int quantity = scan.nextInt();
				String name = scan.next();
						
				for(int a = 0; a < produce.length; a++) {
					if(produce[a].equals(name)){
						boolean bool = true;
						int n = 0;
						for(int b = 0; b < s.length; b++) {
							if(s[b] == null) {
								n = b;
							}
							else if(s[b].equals(name)){
								bool = false;
							}		
						}
					
						totalQuantity[a] = totalQuantity[a] + quantity;
						if(bool) {
							purchasedItems[a]++;
							s[n] = name;
						}
					}
	
					}
			}
		
		}
		scan.close();
		for(int i = 0; i < numOfItems; i++) {
			if(purchasedItems[i] == 0) {
				System.out.print("No customers bought " + produce[i]);
			} else {
				System.out.println(purchasedItems[i] + " customers bought " + totalQuantity[i] + " " + produce[i]);
			}	
	
		}
	}
}
