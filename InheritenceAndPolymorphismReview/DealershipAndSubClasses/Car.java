public class Car extends Dealership implements Insurable{
    private int seatingCapacity;
    private int doorQuantity;

    public Car(int seatingCapacity, int doorQuantity) {
        this.seatingCapacity = seatingCapacity;
        this.doorQuantity = doorQuantity;
    }
    
    public Car(int VIN, double cost, String color, String category, String dateOfArrival, int seatingCapacity, int doorQuantity) {
        this.setVIN(VIN);
        this.setCost(cost);
        this.setColor(color);
        this.setCategory(category);
        this.setDateOfArrival(dateOfArrival);
        this.seatingCapacity = seatingCapacity;
        this.doorQuantity = doorQuantity;
    }
    
    @Override
    public double calculateInsurance(double insurance_rate){
        return (this.getCost() * insurance_rate);
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setDoorQuantity(int doorQuantity) {
        this.doorQuantity = doorQuantity;
    }
    
}
