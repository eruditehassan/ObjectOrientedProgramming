public class Main {
    public static void main(String args[]){
        Dealership[] d = new Dealership[10];
        Car c = new Car(12345,2500.00,"Red","Car","17/04/2019",4,4);
        d[0] = c;
        Motorcycle m1 = new Motorcycle(25645,1000.00,"Black","Motorcycle","17/04/2019",3.2);
        d[1] = m1;
        Motorcycle m2 = m1.clone();
        d[2] = m2;
        
        if (m1.compareTo(m2)==0)
                System.out.println("Given objects are equal");
        else
            System.out.println("Given objects are not equal");
    }
}
