public class Person {
    //The person class which is going to serve as super class of many sub classes
    //All the necessary data fields are defined
    String name;
    String address;
    String phone;
    String email;
    Person(){
        //The default no arguement constructor
    }
    Person(String n){
        //Constructor accepting only one parameter
        name = n;
    }
    Person(String n,String a){
        //Constructor with two parameters
        name = n;
        address =a;
    }
    Person(String n,String a, String p){
        //Constructor with three parameters
        name = n;
        address =a;
        phone = p;
    }
    Person(String n,String a, String p,String e){
        //Constructor with four parameters
        name = n;
        address =a;
        phone = p;
        email = e;
    }
    //Overriding toString Method
    @Override
    public String toString(){
        //Returning information about an object of person class
        return ("Class Name: "+Person.class.getSimpleName()+"  Person's name: "+ name);
    }
}
