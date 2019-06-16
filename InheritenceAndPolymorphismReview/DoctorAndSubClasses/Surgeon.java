public class Surgeon extends Doctor{
    
    @Override
    public void treatPatient(){
        //Implementing the treatPatient method        
        System.out.println("Treatment is given by a "+this.getClass().getSimpleName());
    }
}
