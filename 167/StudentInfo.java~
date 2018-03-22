import java.util.Scanner;

class Student {
    String name;
    int gradeLevel;
    double average;
}

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student[] student = new Student[3];
       
        student[0] = new Student();
        System.out.print("Enter the first student's name: ");
        student[0].name = input.next();
        System.out.print("Enter the first student's grade level: ");
        student[0].gradeLevel = input.nextInt();
        System.out.print("Enter the first student's average: ");
        student[0].average = input.nextDouble();
        
        student[1] = new Student();
        System.out.print("Enter the second student's name: ");
        student[1].name = input.next();
        System.out.print("Enter the second student's grade level: ");
        student[1].gradeLevel = input.nextInt();
        System.out.print("Enter the second student's average: ");
        student[1].average = input.nextDouble();
        
        student[2] = new Student();
        System.out.print("Enter the third student's name: ");
        student[2].name = input.next();
        System.out.print("Enter the third student's grade level: ");
        student[2].gradeLevel = input.nextInt();
        System.out.print("Enter the third student's average: ");
        student[2].average = input.nextDouble();
        
        System.out.println(" ");
        
        System.out.println("The names are: " + student[0].name + " " + student[1].name + " " + student[2].name);
        System.out.println("The grades are: " + student[0].gradeLevel + " " + student[1].gradeLevel + " " + student[2].gradeLevel);
        System.out.println("The averages are: " + student[0].average + " " + student[1].average + " " + student[2].average);
    
        System.out.println(" ");
    
        System.out.println("The average for the three students " + (student[0].average + student[1].average + student[2].average)/ 3);
    }
}
