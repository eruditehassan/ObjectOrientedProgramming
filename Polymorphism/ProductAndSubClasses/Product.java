public abstract class Product {
    //Product class which is going to serve as parent class for online shop program
    //The necessary data fields
    private double regularPrice;
    
    Product(double regularPrice){
        //The constructor for product class taking one parameter
        this.regularPrice = regularPrice;
    }
    //Abstract computeSalePrice method
    public abstract double computeSalePrice();

    public double getRegularPrice() {
        //Regular price getter method
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        //Regular price setter method
        this.regularPrice = regularPrice;
    }
    
}
