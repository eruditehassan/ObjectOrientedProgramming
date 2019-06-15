import java.util.Scanner; //Importing Scanner to input data from user
public class PositionCalculator {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double time; //Declaring variable for time input
        double initial_position; //Declaring variable for Initial Position input
        double initial_velocity; //Declaring variable for Initial Velocity input
        double acceleration; //Declaring variable for Acceleration input
        System.out.print("Enter the time:"); //Prompting before taking input to guide user
        time = input.nextDouble(); //Taking input and storing in variable
        System.out.print("Enter the Initial Velocity:"); //Prompting before taking input to guide user
        initial_velocity = input.nextDouble(); //Taking input and storing in variable
        System.out.print("Enter the Position:"); //Prompting before taking input to guide user
        initial_position = input.nextDouble(); //Taking input and storing in variable
        System.out.print("Enter the Acceleration:"); //Prompting before taking input to guide user
        acceleration = input.nextDouble(); //Taking input and storing in variable
        //Calculating the expression for Final Position
        double final_position =  initial_position + (initial_velocity * time) + (0.5 * acceleration * Math.pow(time,2));
        // Printing the result to the user
        System.out.printf("The final Position is:%.3f\n", final_position);
    }

}
