public class Faculty extends Employee{
    //Faculty class that is a sub class of Employee class
    //Defining all the required data fields
    int officeHours;
    String rank;
    //A no arguement consturctor
    Faculty(){}
    Faculty(String n){
        //A constructor with an arguement
        super(n);
    }
    Faculty(String n, int ohours){
        //Constructor accepting two arguements
        super(n);
        officeHours = ohours;
    }
    Faculty(String n, int ohours, String r){
        //Three arguement constructor
        super(n);
        officeHours = ohours;
        rank = r;
    }
    @Override
    public String toString(){
        //Returning information about the object of this class
        return ("Class Name: "+Faculty.class.getSimpleName()+"  Person's name: "+ name);
    }
}
