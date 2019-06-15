public class Monkey extends LivingThing {
    //This is a Monkey class which is subclass of LivingThing
    
    Monkey(String name){
        //Monkey constructor
        super(name);
    }
    //overriding walk method from superclass
    @Override
    public void walk(){
        System.out.println("Monkey " + getName() + " walks!");
    }
}
