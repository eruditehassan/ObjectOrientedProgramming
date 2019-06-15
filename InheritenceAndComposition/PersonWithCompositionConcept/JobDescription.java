public class JobDescription {
    //This class describes Job Description of a faculty member
    //Defining all data fields
    private String designation;
    private double salary;
    private int teachingLoad;
    //No Arg constructor
    JobDescription(){}
    
    JobDescription(String designation){
        //One arg constructor
        this.designation = designation;
    }
    
    JobDescription(String designation, double salary){
        //Two arg constructor
        this.designation = designation;
        this.salary = salary;
    }
    
    JobDescription(String designation, double salary, int teachingLoad){
        //Three arg constructor
        this.designation = designation;
        this.salary = salary;
        this.teachingLoad = teachingLoad;
    }
    
    
    public String getDesignation(){
        //Designation getter method
        return designation;
    }
    
    public void setDesignation(String designation){
        //Designation setter method
        this.designation = designation;
    }
    
    public double getSalary(){
        //Salary getter method
        return salary;
    }
    
    public void setSalary(double salary){
        //Salary Setter method
        this.salary = salary;
    }
    
    public int getTeachingLoad(){
        //Teaching load getter method
        return teachingLoad;
    }
    
    public void setTeachingLoad(int teachingLoad){
        //Teaching load setter method
        this.teachingLoad = teachingLoad;
    }
    public String getJobDescription(){
        //Method returning the total job description of a faculty member
        return ("Job Description is:"+"\n -Designation: "+designation+"\n -Salary: "+salary+"\n -Teaching Load: "+teachingLoad);
    }
}
