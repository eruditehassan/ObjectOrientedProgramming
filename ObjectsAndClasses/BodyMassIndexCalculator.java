public class BodyMassIndexCalculator {
    //Defining the constants for formula
    final static double KG_PER_POUND=0.45359237;
    final static double METERS_PER_INCH=0.025;
    //Defining all the necessary instance variables
    String name;
    int age;
    double weight;
    double height;
    double bmi;
BodyMassIndexCalculator(String n, double w, double h){
    //Constructor that takes name (n), weight (w), and height(h)
    name = n;
    weight = w;
    height = h;
} 
BodyMassIndexCalculator(String n, int a, double w, double h){
    //Constructor that takes name (n),age (a), weight (w), and height(h)
    name = n;
    age = a;
    weight = w;
    height = h;
}    
BodyMassIndexCalculator(BodyMassIndexCalculator object){
    //The copy constructor that takes an object of BodyMassIndexCalculator classs as an arguement
    //Using every field of the object given as arguement to assign values to the object
    //on which this constructor is called
    this.name = object.name;
    this.age = object.age;
    this.weight = object.weight;
    this.height = object.height;
    this.bmi = object.bmi;
}
public double getBMI(){
    //The method that uses a formula to calculate the BMI value
    bmi = weight * KG_PER_POUND / (height * METERS_PER_INCH *height * METERS_PER_INCH);
    return (bmi);
} //Ending the method

public String getStatus(){
    //A method that uses the BMI value to return the status
    //Using necessary conditions to get the condition
    if (bmi<18.5)
        return String.format("You're Underweight");
    else if (bmi>18.5 && bmi<24.9)
        return String.format("You're Normal");
    else if (bmi>25 && bmi<29.9)
        return String.format("You're Overweight");
    else if (bmi>=30)
        return String.format("You're Obese");
    else
        return String.format("BMI value not in range");
}

public int getAge(){
    //Age getter method
    return age;
}

public String getName(){
    //Name getter method
    return name;
}

public double getWeight(){
    //Weight getter method
    return weight;
}

public double getHeight(){
    //Height getter method
    return height;
}

public void setName(String n){
    //Name setter method
    name = n;
}
public void setAge(int a){
    //Age setter method
    age = a;
}
public void setWeight(double w){
    //Weight setter method
    weight = w;
}
public void setHeight(double h){
    //Height setter method
    height = h;
}
}
import java.util.Scanner;
class BMITest {
    //This class will test the BMI class
    public static void main(String args[]){
        //Main method to execute
        //Defining some variables to get input from user
        double height;
        double weight;
        String name;
        int age;
        //Creating Scanner object to get input
        Scanner input = new Scanner(System.in);
        //Creating a guiding message to guide user about what to enter
        System.out.print("Enter your Name:");
        //Taking the input
        name = input.next();
        //Creating a guiding message to guide user about what to enter
        System.out.print("Enter your Age:");
        //Taking the input
        age = input.nextInt();
        //Creating a guiding message to guide user about what to enter
        System.out.print("Enter your weight in pounds:");
        //Taking the input
        weight = input.nextDouble();
        //Creating a guiding message to guide user about what to enter
        System.out.print("Enter your height in inches:");
        //Taking the input
        height = input.nextDouble();
        //Creating the object person1 using the values taken from user
        BodyMassIndexCalculator person1 = new BodyMassIndexCalculator(name,age,weight,height);
        //Using the copy constructor to copy same values from person1 to person2
        BodyMassIndexCalculator person2 = new BodyMassIndexCalculator(person1);
        System.out.println();
        //Calling the getBMI() method on person1 to get BMI value
        person1.getBMI();
        //Printing BMI value and Status
        System.out.println("Your BMI is "+ person1.bmi);
        System.out.println(person1.getStatus());
        System.out.println("The object generated using copy constructor:");
        //Invoking getBMI() method on copied object to verify the copy constructor
        person2.getBMI();
        //Printing out the results
        System.out.println("Your BMI is "+ person2.bmi);
        System.out.println(person2.getStatus());
        
    }
    
}

