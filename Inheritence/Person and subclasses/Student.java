public class Student extends Person{
    //A student class that is sub class of Person class
    //Defining all the necessary data fields
    //classStatus is fixed and can not be changed
    final String classStatus="Freshman";
    Student(){
        //A default no arguement constructor
    }
    Student(String n){
        //A constructor accepting one arguement
        //Invoking super class constructor 
        super(n);
    }
    @Override
    public String toString(){
        //Returning information about the object of this class
        return ("Class Name: "+Student.class.getSimpleName()+"  Person's name: "+ name);
    }
}
