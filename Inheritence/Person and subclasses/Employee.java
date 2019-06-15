public class Employee extends Person{
    //Employee class that is a sub class of person class
    //Defining all the datafields
    String office;
    double salary;
    String dateHired;
    //A no arguement constructor
    Employee(){}
    Employee(String n){
        //A constructor accepting an arguement
        //Invoking the consturctor of super class
        super(n);
    }
    Employee(String n, String o){
        //Two arguement constructor
        super(n);
        office = o;
    }
    Employee(String n, String o, double sal){
        //Three arguement constructor
        super(n);
        office = o;
        salary = sal;
    }
    Employee(String n, String o, double sal,String date){
        //Four arguement constructor
        super(n);
        office = o;
        salary = sal;
        dateHired = date;
    }
    @Override
    public String toString(){
        //Returning information about object of this class
        return ("Class Name: "+Employee.class.getSimpleName()+"  Person's name: "+ name);
    }
}
