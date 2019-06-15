import java.util.Scanner; //Importing scanner to get input from user
public class BMI {  //Defining class name
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Initializing all the variables required in this program
        double weight;
        double height;
        double bmi;
        System.out.print("Enter your Weight(in Kilograms):"); //Prompting user for a guiding in giving input
        weight = input.nextDouble(); //Inputing weight from the user
        System.out.print("Enter your Height(in Meters):"); //Prompting user for a guiding in giving input
        height = input.nextDouble(); //Inputing height from the user
        bmi = (weight)/(height*height); //Calculating the BMI value
        System.out.printf("Your BMI value is: %.3f\n",bmi); //Displaying the calculated BMI value
        //Using conditionals to put the user in a category based on the BMI value
        if (bmi < 18.5){
            System.out.println("You're Underweight!"); //Pritning based on condition
        }    
        else if (18.5<bmi && bmi < 24.9){
            System.out.println("You're Normal!"); //Pritning based on condition
        }    
        else if (25<bmi && bmi < 29.9){
            System.out.println("You're Overweight!"); //Pritning based on condition
        }    
        else if (bmi >= 30){
            System.out.println("You're Obese!"); //Pritning based on condition
        }    
    }
    
}
