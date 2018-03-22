import java.util.Scanner;

class Student {
    String name;
    int gradeLevel;
    double average;
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student student1 = new Student();
        System.out.print("Enter the first student's name: ");
        student1.name = input.next();
        System.out.print("Enter the first student's grade level: ");
        student1.gradeLevel = input.nextInt();
        System.out.print("Enter the first student's average: ");
        student1.average = input.nextDouble();
        
        Student student2 = new Student();
        System.out.print("Enter the second student's name: ");
        student2.name = input.next();
        System.out.print("Enter the second student's grade level: ");
        student2.gradeLevel = input.nextInt();
        System.out.print("Enter the second student's average: ");
        student2.average = input.nextDouble();
        
        Student student3 = new Student();
        System.out.print("Enter the third student's name: ");
        student3.name = input.next();
        System.out.print("Enter the third student's grade level: ");
        student3.gradeLevel = input.nextInt();
        System.out.print("Enter the third student's average: ");
        student3.average = input.nextDouble();
        
        System.out.println(" ");
        
        System.out.println("The names are: " + student1.name + " " + student2.name + " " + student3.name);
        System.out.println("The grades are: " + student1.gradeLevel + " " + student2.gradeLevel + " " + student3.gradeLevel);
        System.out.println("The averages are: " + student1.average + " " + student2.average + " " + student3.average);
    
        System.out.println(" ");
    
        System.out.println("The average for the three students " + (student1.average + student2.average + student3.average)/ 3);
    }

}
