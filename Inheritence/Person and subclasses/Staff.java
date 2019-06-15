public class Staff extends Employee {
    //Staff class is a subclass of Employee class
    //defining the datafield that is distinct in this class
    String title;
    //A no argument constructor
    Staff (){}
    Staff (String n){
        //A consturctr that accepts one parameter
        //A consturctor call to the super class
        super (n);
    }
    Staff (String n, String t){
        //A constructor that accepts two arguements
        super (n);
        title = t;
    }
    @Override
    public String toString(){
        //Providing information about an object of this class
        return ("Class Name: "+Staff.class.getSimpleName()+"  Person's name: "+ name);
    }
}
