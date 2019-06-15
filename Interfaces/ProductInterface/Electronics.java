public abstract class Electronics extends Product implements ElectronicsInterface{
    //Electronics class which is a subclass of Product Class
    //Based on interface ElectronicsInterface
    private String manufacturer;
    
    Electronics(double regularPrice, String manufacturer){
        //The constructor taking two parameters
        super(regularPrice);
        this.manufacturer = manufacturer;
    }

    @Override
    public String getManufacturer() {
        //Manufacturer get method
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        //Manufacturer setter method
        this.manufacturer = manufacturer;
    }
}
