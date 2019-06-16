public class TestMain {
    public static void main(String args[]){
        //The main method to check the capabilities of the program
        //Defining a Doctor reference
        Doctor d;
        //Creating a surgeon object
        d = new Surgeon();
        //Invoking methods on the object
        d.displayIdentity();
        d.treatPatient();
        
        //Storing Physician in the same reference
        d = new Physician();
        //Invoking the methods
        d.displayIdentity();
        d.treatPatient();   
    }
}
