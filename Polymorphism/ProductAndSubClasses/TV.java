public class TV extends Electronics{
    //Instance variables are defined
    private int size;
    
    TV(double regularPrice, String manufacturer, int size){
        //The constructror taking 3 arguements
        super(regularPrice, manufacturer);
        this.size = size;
    }
    
    @Override
    public double computeSalePrice(){
        //Method to compute sale price
        return getRegularPrice()*0.8;
    }
}
