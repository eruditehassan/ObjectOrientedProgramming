import java.util.Scanner;
public class TestRectangle {
    //This class will test the Rectangle class
    public static void main (String args[]){
        //Defining the varialbes to get input from user
        double width;
        double height;
        String color;
        boolean filled;
        //Creating scanner object
        Scanner input = new Scanner(System.in);
        //Getting input from user for all the required information
        System.out.print("Enter the width of the Rectangle: ");
        width = input.nextDouble();
        System.out.print("Enter the height of the Rectangle: ");
        height = input.nextDouble();
        System.out.print("Enter the color of the Rectangle: ");
        color = input.next();
        System.out.print("Is the rectangle filled (true/false): ");
        filled = input.nextBoolean();
        //Creating rectangle object
        Rectangle r1 = new Rectangle(width,height);
        //Setting color
        r1.setColor(color);
        //Setting filled value
        r1.setFilled(filled);
        //Printing out the area of rectangle
        System.out.println("Area of the rectangle is: " + r1.getArea());
        //Printing out the perimeter of the rectangle
        System.out.println("Perimeter of the rectangle is: " + r1.getPerimeter());
        //Printing out whether it is filled or not
        System.out.println("Filled value: "+r1.isFilled());
        
    }
    
}
