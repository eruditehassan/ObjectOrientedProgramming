public abstract class Product implements ProductInterface{
    //Product class which is going to serve as parent class for online shop program
    //The necessary data fields
    private double regularPrice;
    
    Product(double regularPrice){
        //The constructor for product class taking one parameter
        this.regularPrice = regularPrice;
    }
    //Abstract computeSalePrice method
    @Override
    public abstract double computeSalePrice();

    @Override
    public double getRegularPrice() {
        //Regular price getter method
        return regularPrice;
    }

    @Override
    public void setRegularPrice(double regularPrice) {
        //Regular price setter method
        this.regularPrice = regularPrice;
    }
    
}
