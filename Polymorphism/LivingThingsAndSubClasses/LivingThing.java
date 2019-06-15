public abstract class LivingThing {
    //Adding all the data fields
    private String name;
    
    LivingThing(String name){
        //The constructor
        this.name = name;
    }
    //All the necessary methods
    public void breath(){}
    public void eat(){}
    public abstract void walk();

    public void setName(String name) {
        //Set name method
        this.name = name;
    }

    public String getName() {
        //Get name method
        return name;
    }
}
