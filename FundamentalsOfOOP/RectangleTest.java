public class RectangleTest {
        public static void main(String[] args){ //Main method
        Rectangle firstrectangle = new Rectangle(4,40); //First object
        Rectangle secondrectangle = new Rectangle(3.5,35.9); //Second object
        firstrectangle.area = firstrectangle.getArea(4, 40); //Calling getArea
        secondrectangle.area = secondrectangle.getArea(3.5,35.9);
        firstrectangle.perimeter = firstrectangle.getPerimeter(3.5,35.9); //Calling getPerimeter
        secondrectangle.perimeter = secondrectangle.getPerimeter(3.5,35.9);
        //Printing out the results
        System.out.printf("The values for Rectangle 1 are:\n Width: %.3f\n Height: %.3f\n Area: %.3f\n Perimeter: %.3f\n",firstrectangle.width,firstrectangle.height,firstrectangle.area,firstrectangle.perimeter);
        System.out.printf("The values for Rectangle 2 are:\n Width: %.3f\n Height: %.3f\n Area: %.3f\n Perimeter: %.3f\n",secondrectangle.width,secondrectangle.height,secondrectangle.area,secondrectangle.perimeter);
    }
}
