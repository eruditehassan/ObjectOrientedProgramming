public class Motorcycle extends Dealership implements Comparable<Motorcycle>, Cloneable{
    private double saddleHeight;

    public Motorcycle(double saddleHeight) {
        this.saddleHeight = saddleHeight;
    }
    
    public Motorcycle(int VIN, double cost, String color, String category, String dateOfArrival, double saddleHeight) {
        this.setVIN(VIN);
        this.setCost(cost);
        this.setColor(color);
        this.setCategory(category);
        this.setDateOfArrival(dateOfArrival);
        this.saddleHeight = saddleHeight;
    }
   

    public double getSaddleHeight() {
        return saddleHeight;
    }

    public void setSaddleHeight(double saddleHeight) {
        this.saddleHeight = saddleHeight;
    }
    @Override
    public int compareTo(Motorcycle m){
        if (this.getVIN() == m.getVIN() && this.getCost() == m.getCost() && this.getColor() == m.getColor() && 
                this.getCategory() == m.getCategory() && this.getDateOfArrival() == m.getDateOfArrival() &&
                this.saddleHeight == m.saddleHeight)
            return 0;
        else
            return -1;
    }
    @Override
    public Motorcycle clone(){
        return new Motorcycle(this.getVIN(), this.getCost(), this.getColor(),this.getCategory(),
                this.getDateOfArrival(),this.saddleHeight);
    }
}
