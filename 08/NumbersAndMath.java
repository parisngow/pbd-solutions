public class NumbersAndMath {
	public static void main(String[] args) {
	
	//Declaring they will count chickens
	System.out.println("I will now count my chickens:");
	
	//Totaling the amount of hens
	System.out.println("Hens " + (25 + 30 / 6));
	//Totaling the amount of roosters
	System.out.println("Roosters " + (100 - 25 * 3 % 4));
	
	//Declaring they will count eggs
	System.out.println("Now I will count the eggs:");
	
	//Totaling the amount of eggs
	System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);
	
	//Asking if 3+2 is less than 5-7
	System.out.println("Is it true that 3 + 2 < 5 - 7?");

	//Testing the above statement out
	System.out.println(3+2 < 5-7);
	
	//Verifying result through more thorough investigation
	System.out.println("What is 3 + 2? " + (3 + 2));
	System.out.println("What is 5 - 7? " + (5 - 7));

	//Realization and understanding of the result
	System.out.println("Oh, that's why it's false.");

	System.out.println("How about some more.");
	
	//Testing out whether 5 is greater than -2
	System.out.println("Is it greater? " + (5 > -2));
	//Testing out whether 5 is greater or equal to -2
	System.out.println("Is it greater or equal? " + (5 >= -2));
	//Testing out whether 5 is less than or equal to -2
	System.out.println("Is it less or equal? " + ( 5 <= -2));

	}
}
