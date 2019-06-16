public class Dealership {
    private int VIN;
    private double cost;
    private String color;
    private String category;
    private String dateOfArrival;
    
    public String Report(){
        return("Vehicle Identification Number (VIN): "+this.VIN+"\nColor: "+this.color+ "\nCategory: "+ this.category+
                "\nDate of Arrival (DoA): "+this.dateOfArrival);
    }

    public int getVIN() {
        return VIN;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }
}
