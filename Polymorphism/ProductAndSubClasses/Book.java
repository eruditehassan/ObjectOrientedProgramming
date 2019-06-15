public class Book extends Product{
    //Adding all the necessary data fields
    private String publisher;
    private int yearPublished;
    
    Book(double regularPrice, String publisher, int yearPublished){
        //Constructor of Book class
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    //overriding the computeSalePrice method
    @Override
    public double computeSalePrice(){
        return getRegularPrice()*0.5;
    }

    public String getPublisher() {
        //Getting publisher
        return publisher;
    }

    public int getYearPublished() {
        //Getting year Published of the book
        return yearPublished;
    }

    public void setPublisher(String publisher) {
        //Setting publisher
        this.publisher = publisher;
    }

    public void setYearPublished(int yearPublished) {
        //Setting year published
        this.yearPublished = yearPublished;
    }
}
