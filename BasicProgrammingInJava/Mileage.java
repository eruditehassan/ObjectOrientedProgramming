import java.util.Scanner; //Importing Scanner to input data from user
public class Mileage { //Defining class name
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        // Initializing all the variables required in the program
        int trips;
        int kilometers=0;
        int total_kilometers=0;
        int liters=0;
        int total_liters=0;
        double mileage_each_trip;
        double total_mileage;
        int counter = 1;
        System.out.println("Enter -1 at any point to exit the program and display mileage calcualted till that point");
        System.out.print("Based on how many trips do you want to calculate the mileage:"); //Prompting user for a guiding in giving input
        trips = input.nextInt();
        // Using -1 as sentinal to break out of the loop at any time
        while (counter <= trips && trips != -1 && kilometers != -1 && liters != -1){
            System.out.printf("Provide information for trip number: %d\n",counter); //Using counter to specify trip number
            System.out.print("Enter the number of kilometers driven in this trip:"); //Prompting user for a guiding in giving input
            kilometers = input.nextInt(); //Inputting the kilometers of a specific trip
            System.out.print("Enter the number of liters of petrol used in this trip:"); //Prompting user for a guiding in giving input
            liters = input.nextInt(); //Inputing the liters of petrol consumed of a specific trip
            mileage_each_trip = (double) (kilometers / liters) ; //using (double) to convert type to double as required in the program
            System.out.printf("The mileage in trip number %d is %.3f\n",counter,mileage_each_trip);
            total_kilometers += kilometers; //Summing the kilometers to a total kilometer variable during each iteraction
            total_liters += liters; //Summing the liters to a total liters variable during each iteraction
            counter++; //Incrementing the counter to control the loop
        }
    total_mileage = (double) (total_kilometers / total_liters); //Calculating the total mileage
    System.out.printf("The total mileage of all the trips is: %.3f\n",total_mileage); //Printing out the total mileage
    }
}
