//Necarri Moore CIS406 Vacation Diary part 1//
package vacationdiary1;

import java.util.Scanner;

public class VacationDiary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the date vacation started: ");
		String date = input.nextLine();
		
		System.out.print("Enter the city visited: ");
		String city = input.nextLine();
		
		System.out.print("Enter the country visited: ");
		String country = input.nextLine();
		
		System.out.print("Enter the number of days: ");
		int days = input.nextInt ();
		input.nextLine();
		
		System.out.print("Enter the mode of travel (car, plane, ship, train, bus): ");
		String travelMode = input.nextLine();
		
		System.out.println();
		
System.out.println("Vacation Diary");

System.out.println("---------------");

System.out.println("Trip Details:");

		System.out.println("Date: " + date);
		System.out.println("City: " + city);
		System.out.println("Country: " + country);
		System.out.println("Number of Days: " + days);
		System.out.println("Mode of Travel: " + travelMode);
		
		input.close();
	}

}
