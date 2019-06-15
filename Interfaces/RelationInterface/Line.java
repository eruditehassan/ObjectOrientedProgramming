public class Line implements RelationInterface{
    //A line class that implements the RelationInterface
    //Defining all the necessary data fields
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Line(double x1, double x2, double y1, double y2) {
        //Constructor of the Line class
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double getLength(){
        //method used to find the length of a line
        return Math.sqrt((Math.pow((this.x1 + this.x2), 2)+ Math.pow(this.y1 + this.y2, 2)));
    }
   
    @Override
    public boolean isGreater(Object one, Object two){
        //Method to find if a line is greater than the other
        return ((Line)one).getLength() > ((Line)two).getLength();
    }
    @Override
    public boolean isLess(Object one, Object two){
        //Method to find if a line is less than the other line
        return ((Line)one).getLength() < ((Line)two).getLength();
    }
    @Override
    public boolean isEqual(Object one, Object two){
        //Method to find out if two lines are equal
        return  ((Line)one).getLength() == ((Line)two).getLength();
    }
}
