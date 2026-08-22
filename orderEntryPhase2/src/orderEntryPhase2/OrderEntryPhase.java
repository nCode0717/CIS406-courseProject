//Necarri Moore CIS 406 Item Order Calculator phase 2//
package orderEntryPhase2;

import java.util.Scanner;

public class OrderEntryPhase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter item number: ");
		String itemNumber = input.nextLine();
		
		System.out.print("Enter item description: ");
		String itemDescription = input.nextLine();
		
		System.out.print("Enter item price: ");
		double itemPrice = input.nextDouble();
		
		System.out.print("Enter quantity ordered: ");
		int quantityOrdered = input.nextInt();
		
		double grossAmount = itemPrice * quantityOrdered;
		
		System.out.print("Enter tax percentage: ");
		double taxPercent = input.nextDouble();
		
		double taxAmount = grossAmount * taxPercent;
		
		System.out.print("Enter discount percentage: ");
		double discountPercent = input.nextDouble();
		
		double discountAmount = grossAmount * discountPercent;
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		
		System.out.println();
		System.out.println("Item Information");
		System.out.println();
		
		System.out.printf("%-15s %-20s %-12s %-10s %-12s %-12s %-15s %-15s %-12s%n",
				"Item Number",
				"Description",
				"Item Price",
				"Quantity",
				"Tax Precent",
				"Tax Amount",
				"Discount Percent",
				"Discount Amount",
				"Net Amount");
		
		System.out.printf("%-15s %-20s $%-11.2f %-10d %-12.2f $%-11.2f %-15.2f $%-14.2f $%-12.2f%n",
				itemNumber,
				itemDescription,
				itemPrice,
				quantityOrdered,
				taxPercent,
				taxAmount,
				discountPercent,
				discountAmount,
				netAmount);
		
		input.close();
	}

}
