package Part_1;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int displayTotalTrigger = 0;
		double total = 0;
		
		while(displayTotalTrigger != 10)
		{
			System.out.print("Please enter the product number of the item purchased: ");
			int productID = input.nextInt();
			System.out.print("Please enter the quantity of products that were puchased: ");
			int quantitySold = input.nextInt();

			Product product1;
			product1 = new Product(productID, quantitySold);
			total += product1.calcTotal();
			
			System.out.print("To continue adding products enter 0, to see your total enter 10: ");
			displayTotalTrigger = input.nextInt();
		}
		
		System.out.printf("$%.2f",total);
		
		input.close();

	}

}
