import java.util.Date;
public class GeometricObject {
    //This is a class of Geometric Objects
    //Defining all the data fields
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();
    //The default Constructor
    GeometricObject(){}
    GeometricObject(String c,boolean fill ){
        //The constructor which accepts arguements
        color = c;
        filled = fill;
    }
    String getColor(){
        //Color getter method
        return color;
    }
    void setColor(String c){
        //Color setter method
        color = c;
    }
    boolean isFilled(){
        //Filled boolean getter method
        return filled;
    }
    void setFilled(boolean fill){
        //Fill setter method
        filled = fill;
    }
    java.util.Date getDateCreated(){
        //Date getter method
        return dateCreated;
    }
    //Overriding toString method
    @Override
    public String toString(){
        //Returning details about the class objects
        return ("Geometric Figure: color = "+color+"Filled = "+filled+ "Date Created = "+dateCreated);
    }
}
