public abstract class Electronics extends Product{
    //Electronics class which is a subclass of Product Class
    private String manufacturer;
    
    Electronics(double regularPrice, String manufacturer){
        //The constructor taking two parameters
        super(regularPrice);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        //Manufacturer get method
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        //Manufacturer setter method
        this.manufacturer = manufacturer;
    }
}
