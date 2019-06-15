public class Human extends LivingThing{
    //The Human class which is a subclass of LivingThing
    Human(String name){
        //The constructor taking name as a parameter
        super(name);
    }
    @Override
    //Overriding walk method
    public void walk(){
        //Walk method
        System.out.println("Human " + getName() + " walks!");
    }
    
}
