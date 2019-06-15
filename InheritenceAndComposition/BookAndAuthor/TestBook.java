public class TestBook {
    //This class tests the capabilities of Book class
    public static void main(String args[]){
        //Creating all necessary author and book objects
        Author hilton = new Author("James Hilton");
        //Passing author object as a parameter for Book constructor
        Book chips = new Book("Goodbye, Mr. Chips",hilton,5.99 );
        Author rowling = new Author("J. K. Rowling");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone",rowling,2.99,100);
        Author martin = new Author("George R. R. Martin");
        Book gameOfThrones = new Book("A Game of Thrones",martin,9.99);
        
        //Printing details about first book
        System.out.println("Book: " + chips.getName()+"\nAuthor: "+chips.getAuthor().getAuthorName());
        System.out.println();
        //Printing details about second book
        System.out.println("Book: " + harryPotter.getName()+"\nAuthor: "+harryPotter.getAuthor().getAuthorName()+"\nPrice: "+ harryPotter.getPrice());
        System.out.println();
        //Printing details about Third book
        System.out.println("Book: " + gameOfThrones.getName()+"\nAuthor: "+gameOfThrones.getAuthor().getAuthorName());
        System.out.println();
    }
}
