public class Rectangle extends GeometricObject {
    //The Rectangle class which is a sub class of Geometric Object class
    //Defining all the data fields
    private double width;
    private double height;
    
    Rectangle(){
        //The default constructor with default values
        width = 1.0;
        height = 1.0;
    }
    Rectangle(double w, double h){
        //Parameterized Constructor that accepts arguements
        width = w;
        height = h;
    }
    double getArea(){
        //Method that calculates and returns the Area of a rectangle
        return (width*height);
    }
    double getPerimeter(){
        //Method that calculates and returns Perimeter of a rectangle
        return ((2*width)+(2*height));
    }
    //Overiding toString method 
    @Override
    public String toString(){
        //Returning details about the rectangle object
        return ("Rectangle: width = " + width + " height = " + height);
    }
}}
