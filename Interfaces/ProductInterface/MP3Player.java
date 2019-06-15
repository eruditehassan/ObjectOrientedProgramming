public class MP3Player extends Electronics{
    //MP3 is a direct subclass of Electronics class and indirect of product class
    //All datafields are defined
    private String color;

    public MP3Player(double regularPrice, String manufacturer, String color) {
        //The constructor which takes 3 parameters
        super(regularPrice, manufacturer);
        this.color = color;
    }
    // Overrirding the computeSalePrice method
    @Override
    public double computeSalePrice(){
        return getRegularPrice()*0.9;
    }

    public String getColor() {
        //Color getter method
        return color;
    }

    public void setColor(String color) {
        //Color setter method
        this.color = color;
    }
}
