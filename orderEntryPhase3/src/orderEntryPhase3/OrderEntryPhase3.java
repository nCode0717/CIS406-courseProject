//Necarri Moore CIS 406 Item Order Calculator Phase 3//
package orderEntryPhase3;

import java.util.Scanner;

public class OrderEntryPhase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int totalLineItems = 0;
		double totalGrossAmount = 0.0;
		double totalTaxAmount = 0.0;
		double totalDiscountAmount = 0.0;
		double totalNetAmount = 0.0;
		
		String continueEntry = "Y";
		
		while (!continueEntry.equalsIgnoreCase("N")) {
			
			System.out.print("Enter the item number: ");
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
			
			System.out.println("Item Number\tItem Description\tPrice\tQuantity\tTax %\tTax Amount\tDiscount %\tDiscount Amount\tNet Amount");
			
			System.out.printf("%s\t\t%s\t\t$%.2f\t%d\t\t%.2f\t$%.2f\t\t%.2f\t\t$%.2f\t\t$%.2f%n",
					itemNumber,
					itemDescription,
					itemPrice,
					quantityOrdered,
					taxPercent,
					taxAmount,
					discountPercent,
					discountAmount,
					netAmount);
			
			totalLineItems++;
			totalGrossAmount += grossAmount;
			totalTaxAmount += taxAmount;
			totalDiscountAmount += discountAmount;
			totalNetAmount += netAmount;
			
			System.out.println();
			
			input.nextLine();
			
			System.out.print("Enter N to end or any other key to continue: ");
			continueEntry = input.nextLine();
			
		}		
			
			System.out.println("Order Totals");
			
			System.out.println("-------------------------------------------------------");
			System.out.println("Total Line Items: " + totalLineItems);
			System.out.printf("Total Gross Amount: $%.2f%n", totalGrossAmount);
			System.out.printf("Total Tax Amount: $%.2f%n", totalTaxAmount);
			System.out.printf("Total Discount Amount: $%.2f%n", totalDiscountAmount);
			System.out.printf("Total Net Amount: $%.2f%n", totalNetAmount);
			
			input.close();
		}
	}
