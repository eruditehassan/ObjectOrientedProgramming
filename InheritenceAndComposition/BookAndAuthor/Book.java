public class Book {
    //Defining all the necessary data fields
    private String name;
    private Author author;
    private double price;
    //Initializing qtyInStock to zero
    private int qtyInStock=0;
    
    Book(String name, Author author, double price){
        //Book Constructor accepting name, author and price of the book
        this.name = name;
        this.author = author;
        this.price = price;
    }
    Book(String name, Author author, double price, int qtyInStock){
        //Book constructor accepting qtyInStock as well
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    public String getName(){
        //name getter method
        return name;
    }
    public Author getAuthor(){
        //Author object getter method
        return author;
    }
    public double getPrice(){
        //Price getter method
        return price;
    }
    public void setPrice(double price){
        //Price setter method
        this.price = price;
    }
    public int getQtyInStock(){
        //Stock Quantity getter method
        return qtyInStock;
    }
    public void setQtyInStock(int qtyInStock){
        //Stock Quantity setter method
        this.qtyInStock = qtyInStock;
    }
}
