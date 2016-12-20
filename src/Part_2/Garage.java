package Part_2;
import java.util.Scanner;
public class Garage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		double totalParkingFees = 0.0;
		double fee;
		double hours;
		
		System.out.print("Enter the total number of hours parked (enter a negative to see the total of all receipts): ");
		hours = input.nextDouble();
		
		while (hours >= 0.0)
		{
			fee = ParkingCharge.calculateCharges(hours);
			totalParkingFees += fee;
			System.out.printf("The most recent hours entered results in a fee of: $%.2f\n", fee);
			System.out.printf("The total for all hours entered thus far is: $%.2f\n", totalParkingFees);
			System.out.println();
			System.out.print("Enter the total number of hours parked (enter a negative to see the total of all receipts): ");
			hours = input.nextDouble();
		}	
		input.close();
	}
}
