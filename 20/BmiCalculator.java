import java.util.Scanner;

public class BmiCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Your height in inches: ");
    double height = Double.parseDouble(input.nextLine());
    
    //Convert inches to meters
    height /= 39.37007874;
    
    System.out.print("Your weight in pounds: ");
    int weight = Integer.parseInt(input.nextLine());
    
    //Convert pounds to kilograms
    weight *= 0.45359237;
    
    double bmi = weight / (height * height);
    
    System.out.println("Your BMI is " + bmi);
  }
}
