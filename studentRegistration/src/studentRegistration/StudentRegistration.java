//Necarri Moore CIS406 Student Registration Lab//
package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student's last name: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter student's first name: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter student's year of birth: ");
		String yearOfBirth = input.nextLine();
		
		String fullName = firstName + " " + lastName;
		
		String password = firstName + "*" + yearOfBirth;
		
		System.out.println();
		System.out.println("Welcome " + fullName);
		System.out.println("Your registration has been completed.");
		
System.out.println("Your temporary password is: " + password);

		input.close();
	}

}
