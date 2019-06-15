public class HiringDate {
    //All necessary data fields
    private int day;
    private int month;
    private int year;
    
    HiringDate(){
        //No Arg constructor setting (0,0,0) as date and calling arg consturctor
        this(0,0,0);
    }
    
    HiringDate(int day){
        //One arg constructor invoking constructor chaining
        this(day,0,0);
    }
    
    HiringDate(int day, int month){
        //Two arg constructor invoking constructor chaining
        this(day,month,0);
    }
    
    HiringDate(int day, int month, int year){
        //Three arg constructor
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public String getHiringDate(){
        //Hiring Date Getter Method
        return ("The Hiring Date is: " +day+"/"+month+"/"+year);
    }
    public int getDay(){
        //Day getter method
        return day;
    }
    public void setDay(int day){
        //Day Setter method
        this.day = day;
    }
    
    public int getMonth(){
        //Month getter method
        return month;
    }
    
    public void setMonth(int month){
        //Month setter method
        this.month = month;
    }
    
    public int getYear(){
        //Year getter method
        return year;
    }
    
    public void setYear(int year){
        //Year setter method
        this.year = year;
    }
}
