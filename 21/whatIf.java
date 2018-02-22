public class whatIf {
    public static void main(String[] args) {
    
        int people = 20;
        int cats = 20;
        int dogs = 15;
        
        if (people < cats) {
            System.out.println("Too many cats! The world is doomed!"); 
        }
        if (people > cats) {
            System.out.println("Not many cats! The world is saved!");
        }
        if (people < dogs) {
            System.out.println("The world is drooled on!");
        }
        if (people > dogs) {
            System.out.println("The world is dry!");
        }
        
        dogs += 5;
        
        if (people >= dogs) {
            System.out.println("People are greater than or equal to dogs.");
        }
        if (people <= dogs) {
            System.out.println("People are less than or equal to dogs.");
        }
        if (people == dogs) {
            System.out.println("People are dogs.");
        }
    }
}

/*1. The if statement reads the code in the condition it holds to see if it is
is true. If it is true, the code under it will run until the end of the if
statement which is symbolized by the curly braces "}".
2. The curly braces restricts the if statement to a certain amount of code. Therefore,
it will only run the code that is assigned under the if statement when the condition 
within the statement is true.*/ 
 

