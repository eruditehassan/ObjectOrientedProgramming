import java.util.Scanner; //Imporint Scanner to input data from user
public class ExpressionEvaluator {

    public static void main(String args[]) {
        Scanner input = new Scanner (System.in);
        double x; //Declaring input variable
        //Printing guiding messages for user to input data
        System.out.print("Enter the number to evaluate expression:");
        x = input.nextDouble(); //Taking and storing input
        //Using pow function for calculating different powers of x
        double four_pow = Math.pow(x,4); 
        double three_pow = Math.pow(x,3);
        double two_pow = Math.pow(x,2);
        double expression = ((12.3 * four_pow) - (9.1 * three_pow) + (19.3 * two_pow) - (4.6 * x) + 34.2);
        System.out.printf("The value of Expression is:%.3f", expression); //Printing out result
    }
