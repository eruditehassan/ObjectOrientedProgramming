public class Person {
    //All the necessary data fields a person has
    private String name;
    private String cnic;
    private String email;
    private String number;
    //No Arg constructor
    Person(){}
    
    Person(String name){
        //Constructor accepting name as an arguement
        this.name = name;
    }
    
    Person(String name,String cnic){
        //Two arg constructor
        this.name = name;
        this.cnic = cnic;
    }
    
    Person(String name,String cnic, String email){
        //Three arg constructor
        this.name = name;
        this.cnic = cnic;
        this.email = email;
    }
    
    Person(String name,String cnic, String email, String number){
        //Four arg constructor
        this.name = name;
        this.cnic = cnic;
        this.email = email;
        this.number = number;
    }
    
    public String getName(){
        //Name getter method
        return name;
    }
    
    public void Setname(String name){
        //Name setter method
        this.name = name;
    }
    
    public String getCNIC(){
        //CNIC getter method
        return cnic;
    }
    
    public void setCNIC(String cnic){
        //CNIC setter method
        this.cnic = cnic;
    }
    
    public String getEmail(){
        //Email getter method
        return email;
    }
    
    public void setEmail(String email){
        //Email setter method
        this.email = email;
    }
    
    public String getNumber(){
        //Number getter method
        return number;
    }
    
    public void SetNumber(String number){
        //Number setter method
        this.number = number;
    }
}
