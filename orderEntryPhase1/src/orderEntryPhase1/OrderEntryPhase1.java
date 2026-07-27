//Necarri Moore CIS406 Course Project Phase 1//
package orderEntryPhase1;

import java.util.Scanner;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String itemNumber;
		String itemDescription;
		double itemPrice;
		int quantityOrdered;
		double taxAmount;
		double discountAmount;
		double netAmount;
		
		System.out.print("Enter item number: ");
		itemNumber = input.nextLine();
		
		System.out.print("Enter item description: ");
		itemDescription = input.nextLine();
		
		System.out.print("Enter item price: ");
		itemPrice = input.nextDouble();
		
		System.out.print("Enter quantity ordered: ");
		quantityOrdered = input.nextInt();
		
		System.out.print("Enter total tax for the item: ");
		taxAmount = input.nextDouble();
		
		System.out.print("Enter total discount for the item: ");
		discountAmount = input.nextDouble();
		
		System.out.print("Enter net amount for the item: ");
		netAmount = input.nextDouble();
		
		System.out.println();
		System.out.println("Item Number\tDescription\tPrice\tQuantity\tTax\tDiscount\tNet Amount");
		
System.out.printf("%s\t%s\t$%.2f\t%d\t\t$%.2f\t$%.2f\t\t$%.2f%n",
				itemNumber,
				itemDescription,
				itemPrice,
				quantityOrdered,
				taxAmount,
				discountAmount,
				netAmount);

		input.close();
	}

}
