public class VariablesAndNames {
	public static void main(String[] args) {
	
	// Declaring variable for # of cars
	int cars = 100;
	// Declaring variable for # of drivers
	int drivers = 30;
	// Declaring variable for # of passengers
	int passengers = 90;
	// Variable calculating how many cars will not be driven
	int carsNotDriven = cars - drivers;
	// Declaring variable for # of cars that will be driven
	int carsDriven = drivers;
	// Declaring variable for amount of space in each car
	double spaceInACar = 4.0;
	// Variable calculating how many people can be transported with carpool
	double carpoolCapacity = carsDriven * spaceInACar;
	// Variable calculating how many people can ride in each car
	double averagePassengersPerCar = passengers / carsDriven;

	System.out.println("There are " + cars + " cars available.");
	System.out.println("There are only " + drivers + " drivers available.");
	System.out.println("There will be " + carsNotDriven + " people today.");
	System.out.println("We can transport " + carpoolCapacity + " people today.");
	System.out.println("We have " + passengers + " to carpool today.");
	System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
	
	}
}

//1. Because you declared the variable to be a 'double' type of variable, the system expects the number to be
// a decimal value. The decimal is not very necessary as the only equation it is being used in is a 
// multiplication equation where it can be calculated using whole numbers.
//2. A floating point number more or less means that there is a decimal somewhere in the number.

