public class Author {
    //Defining all the necessary Data Fields
    private String name;
    private String email;
    private char gender;
    
    Author(String name){
        //Constructor that accepts name as an arguement
        this.name = name;
    }
    public String getAuthorName(){
        //Name getter method
        return name;
    }
    public void setAuthorName(String name){
        //Name setter method
        this.name = name;
    }
    
}
