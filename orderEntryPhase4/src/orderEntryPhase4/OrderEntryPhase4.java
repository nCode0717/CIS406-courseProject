// Necarri Moore, CIS 406, Displaying an Entire Invoice //
package orderEntryPhase4;

import java.util.Scanner;

public class OrderEntryPhase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String table = "";
		
		System.out.print("Enter invoice date: ");
		String invoiceDate = input.nextLine();
		
		System.out.print("Enter customer name: ");
		String customerName = input.nextLine();
		
		System.out.print("Enter customer street address: ");
		String customerAddress = input.nextLine();
		
		System.out.print("Enter customer city: ");
		String customerCity = input.nextLine();
		
		System.out.print("Enter customer state: ");
		String customerState = input.nextLine();
		
		System.out.print("Enter customer zip code: ");
		String customerZip = input.nextLine();
		
		table += "Invoice Date: " + invoiceDate + "\n";
		table += customerName + "\n";
		table += customerAddress + "\n";
		table += customerCity + ", " + customerState + " " + customerZip + "\n\n";
		
		table += "Item Number\tItem Description\tPrice\tQuantity\tGross Amount\tTax %\tTax Amount\tDiscount %\tDiscount Amount\tNet Amount\n";
		
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
			
			table += String.format(
					"%s\t%s\t$%.2f\t%d\t%.2f\t$%.2f\t%.2f\t$%.2f\t$%.2f%n",
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
			
			input.nextLine();
			
			System.out.print("Enter N to end or any other key to continue: ");
			continueEntry = input.nextLine();
			
			System.out.println();
		}		
			
			table += "\n";
			table += String.format("Total Line Items:\t\t\t%d%n", totalLineItems);
			
			table += String.format("Total Gross Amount:\t\t\t\t$%.2f%n", totalGrossAmount);
			
			table += String.format("Total Tax Amount:\t\t\t\t\t$%.2f%n", totalTaxAmount);
			
			table += String.format("Total Discount Amount:\t\t\t$%.2f%n", totalDiscountAmount);
			
			table += String.format("Total Net Amount:\t\t\t\t\t$%.2f%n", totalNetAmount);
			
			System.out.println();
			
			System.out.println(table);
			
			input.close();
		}
	}

