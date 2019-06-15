public class Student extends Person{
    //Student is extending Person
    //All data fields specific to student
    private String batch;
    private int regNumber;
    //No Arg constructor
   Student(){}
   
   Student(String batch){
       //One arg constructor
       this.batch = batch;
   }
   
   Student(String batch, int regNumber){
       //Two Arg Constructor
       this.batch = batch;
       this.regNumber = regNumber;
   }
   
   Student(String name, String batch, int regNumber){
       //Constructor using name field from Person class
        super(name);
        this.batch = batch;
        this. regNumber=  regNumber;
    }
   
   Student(String name,String cnic, String email, String phone, String batch, int regNumber){
       //Constructor utilizing all data fields from Person class
        super(name,cnic,email,phone);
        this.batch = batch;
        this. regNumber=  regNumber;
    }
   
   public String getBatch(){
       //Batch getter method
       return batch;
   }
   
   public void setBatch(String batch){
       //Batch setter method
       this.batch = batch; 
}
   
   public int getRegNumber(){
       //Registration number getter method
       return regNumber;
   }
   
   public void setRegNumber(int regNumber){
       //Registration number setter method
       this.regNumber = regNumber; 
}
}   
