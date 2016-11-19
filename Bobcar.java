import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		String typeCar = null;

		int carCost, rentalDays = 0, clubMember = 0, Discount = 0, cost = 0;	

		double totalCost = 0, executive = 0, executiveCost = 0;

		System.out.println("We have Economy, Compact, Standard");
		System.out.print("1 for Economy, 2 for Compact, 3 for Standard: ");
		carCost = input.nextInt();

		if (carCost == 1) { 
			carCost = 35;
			typeCar = "Economy";

		} else if (carCost == 2) {
			carCost = 45;
			typeCar = "Compact";


		} else if (carCost == 3) {
			carCost = 95; 
			typeCar = "Standard";


		} else {
			System.out.println("Error occurred, please try again");
		}

		System.out.println(" ");

		System.out.print("Please enter number of rental days: ");
		rentalDays = input.nextInt();

		if (rentalDays < 0) {
			System.out.print("Error occurred, please try again "); 
		}


		System.out.println(" ");

		System.out.println("Are you a club member? ");
		System.out.print("1 for yes, 0 for no: ");	
		clubMember = input.nextInt(); 

		if (clubMember == 1) {
			Discount = (rentalDays / 7) * carCost;
		}

		if (clubMember == 1) { 
			System.out.println("Would you like the Platinum Executive Package? ");
			System.out.print("1 for yes, 0 for no: ");
			executive = input.nextInt();

		} else {
			Discount = 0; 
		}

		cost = (carCost * rentalDays);
		totalCost = cost;


		if (clubMember == 1) {
			totalCost = totalCost - Discount;

			if (executive == 1) {
				executiveCost = cost * 0.15;
				totalCost = (double)(cost - Discount + executiveCost);
			}	
		}

		System.out.println(" ");

		System.out.println("Summary: ");

		System.out.println(rentalDays + " days for " + typeCar + " @ " + carCost);

		System.out.println("Base Cost: " + "              $" + cost);
		if(clubMember == 0){
			System.out.println("Total Cost is            $" + (int)totalCost);
		}
		if (clubMember == 1){	
			System.out.println("Club Member Discount: " + " -  $" + Discount);
			if (executive == 1){
				System.out.println("Executive Package      +  $" +  executiveCost);

			}

			System.out.print("Total estimate is:        $" + totalCost);


		}


	}
}
