public class Person implements PersonInterface, AnotherPersonInterface {
    //Person class is implementing two interfaces
    //Therefore it must have methods speciffied in each of the two interfaces
    //Defining necessary data fields
    private int cashSaving;
    private int retirementFund;
    private String firstName;
    private String lastName;

    public Person(int cashSaving, int retirementFund, String firstName, String lastName) {
        //Constructor of Person class giving values to fields
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    @Override
    public int computeTotalWealth(){
        //Calculating total wealh of a person
        return (cashSaving + retirementFund);
    }
    
    @Override
    public String getName(){
        //Name getter method
        return (firstName+" "+ lastName);
    }
    
    @Override
    public int measureIntelligence(String parameter){
        //Measuring the intelligence of a person
        if ("very less intelligent".equals(parameter)){
            return 20;    
        }
        else if ("less intelligent".equals(parameter))
                return 40;
        
         else if ("Average".equals(parameter))
                return 60;
         
         else if ("intelligent".equals(parameter))
                return 80;
         
          else if ("Very intelligent".equals(parameter))
                return 100;
        else
            return 50;
    }
}
