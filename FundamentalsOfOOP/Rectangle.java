public class Rectangle {
    //Declaring the main variables to be used
    double width =1;
    double height =1;
    double area;
    double perimeter;
    Rectangle(){
        //Default Constructor
    }
    Rectangle(double w, double h){
        //This is the constructor that accepts two values
        width = w;
        height = h;
    }
    double getArea(double width,double height){
        //Method that calculates Area
        return (width*height); //It is returning the area
    }
    double getPerimeter(double width,double height){
        //Method that calculates the Perimater
        return(2*width + 2*height); //Returning perimeter
    }    
}
