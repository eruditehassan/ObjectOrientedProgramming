import java.util.Scanner; //Importing Scanner to input data from user
public class StudentData {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    //Declaring Variables
    String year;
    int courses;
    double gpa;
    //Printing out messages to guide user to input the right data
    System.out.print("Enter the year you're studying in: (Freshman, Sophomore, Junior, Senior):");
    year = input.next(); //Inputing data and storing in a variable
    System.out.print("Enter the number of courses you're taking:");
    courses = input.nextInt(); //Inputing data and storing in a variable
    System.out.print("Enter your GPA:");
    gpa = input.nextDouble(); //Inputing data and storing in a variable
    //Printing the result to the user
    System.out.printf("Student Year:%s\n", year);
    System.out.printf("No of courses student is taking:%d\n", courses);
    System.out.printf("Student's GPA:%.2f\n", gpa);
    }
    
}
