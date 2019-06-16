public abstract class Doctor {
    
    public final void displayIdentity(){
        //A concrete method to display identity
        //Printing out identity
        System.out.println(this.getClass().getName());
    }
    //An abstrract method that will be implemented in child classes
    public abstract void treatPatient();
    
}
