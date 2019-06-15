public class Faculty extends Person {
    //Faculty class is extending Person class
    //Defining all the data fields specific to faculty members
    private String officeNumber;
    private JobDescription jobDescription;
    private HiringDate hiringDate;
    //No arguement constructor
    Faculty(){}
    
    Faculty(String officeNumber){
        //One arg constructor
        this.officeNumber = officeNumber;
    }
    Faculty(String name, String officeNumber){
        //Two arguement constructor
        super(name);
        this.officeNumber = officeNumber;
    }
    Faculty(String name,String cnic, String email, String phone, String officeNumber, JobDescription jobDescription, HiringDate hiringDate ){
        super(name,cnic,email,phone);
        //Constructor that uses person class data fields
        this.officeNumber = officeNumber;
        this.jobDescription = jobDescription;
        this.hiringDate = hiringDate;
    }
    public JobDescription getJobDescription(){
        //JobDescription object getter method
        return jobDescription;
    }
    
    public HiringDate getHiringDate(){
        //HiringDate object getter method
        return hiringDate;
    }
    
    public String getOfficeNumber(){
        //office number getter method
       return officeNumber;
   }
   public void setOfficeNumber(String officeNumber){
       //office number setter method
       this.officeNumber = officeNumber; 
}
}
