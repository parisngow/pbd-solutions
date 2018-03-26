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
        for (int x = 0; x < student.length; x ++) {
            String studentNumber = "";
            
            if (x == 0) {
                studentNumber = "first";
            } else if (x == 1) {
                studentNumber = "second";
            } else if (x == 2) {
                studentNumber = "third";
            }
            
        student[x] = new Student();
        System.out.print("Enter the " + studentNumber + " student's name: ");
        student[x].name = input.next();
        System.out.print("Enter the " + studentNumber + " student's grade level: ");
        student[x].gradeLevel = input.nextInt();
        System.out.print("Enter the " + studentNumber + " student's average: ");
        student[x].average = input.nextDouble();
        
        }
        
        System.out.println(" ");
        
        System.out.println("The names are: " + student[0].name + " " + student[1].name + " " + student[2].name);
        System.out.println("The grades are: " + student[0].gradeLevel + " " + student[1].gradeLevel + " " + student[2].gradeLevel);
        System.out.println("The averages are: " + student[0].average + " " + student[1].average + " " + student[2].average);
    
        System.out.println(" ");
    
        System.out.println("The average for the three students " + (student[0].average + student[1].average + student[2].average)/ 3);
    }
}
