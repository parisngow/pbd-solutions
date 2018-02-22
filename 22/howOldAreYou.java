import java.util.Scanner;

public class howOldAreYou {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? ");
        String name = input.next();
        
        System.out.print("How old are you? ");
        int age = input.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }
        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        if (age > 25) {
            System.out.println("" + name + ", you can do anything that's legal.");
        }
        
    }
}
