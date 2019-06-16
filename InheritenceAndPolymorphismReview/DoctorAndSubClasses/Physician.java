public class Physician extends Doctor{
    //Physician which is a child class of Doctor
    
    @Override
    public void treatPatient(){
        //Implementing the treatPatient method
        System.out.println("Treatment is given by a "+this.getClass().getSimpleName());
    }
}
