public class SavingsAccount {
    //Defining the instance variables to be used
    static double annualInterestRate;
    private double savingsBalance;
    double monthlyinterest;
    
    SavingsAccount(){
        //Default Constructor
        savingsBalance =0; 
        //Keeping value of savingsBalance equal to zero in case when no arguments are given
    }
    SavingsAccount(double balance){
        savingsBalance = balance;
        //Storing the value in variable when balance is given
    }
    
    double calculateMonthlyInterest(){
        //Caclculating monthly interest based on initial balance of account and annual interest rate
       monthlyinterest = ((savingsBalance * annualInterestRate/100)/12);
       savingsBalance +=monthlyinterest;
       return (monthlyinterest);
    }
    static void modifyInterestRate(double newvalue){
        //A method to modify the Annual interest rate
       annualInterestRate = newvalue;
    }
    double getSavingsBalance(){
        //A method to return the current Savings Balance
       return savingsBalance;
    }
}

class TestSavingsAccount {
    static int count=1; //Counter for while loop
    public static void main(String args[]){
        //Defining objects and assigning initial values
        SavingsAccount saver1 = new SavingsAccount(3200.00);
        SavingsAccount saver2 = new SavingsAccount(4500.00);
        //Modifying the interest rate
        SavingsAccount.modifyInterestRate(5.0);
        while (count<=12){
            //Calculating and printing the interest for each months for next 12 months
            saver1.calculateMonthlyInterest();
            System.out.println("The new Savings after "+count+" months for Saver1 is: "+saver1.getSavingsBalance());
            System.out.println();
            saver2.calculateMonthlyInterest();
            System.out.println("The new Savings after "+count+" months for Saver2 is: "+saver2.getSavingsBalance());
            System.out.println();
            count+=1;
        } 
        //Printing the Savings after 12 months for both users
        System.out.println("The new Savings balance after 12 months for Saver1 is: "+saver1.getSavingsBalance());
        System.out.println("The new Savings balance after 12 months for Saver2 is: "+saver2.getSavingsBalance());
        //Modifying interest rate to 7%
        SavingsAccount.modifyInterestRate(7.0);
        //caclulating the monthly interest after modifying interest rate
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        //Printing out the results
        System.out.println();
        System.out.println("The new Savings balance of Saver1 after changed interest rate is: "+saver1.getSavingsBalance());
        System.out.println("The new Savings balance of Saver2 after changed interest rate is: "+saver2.getSavingsBalance());
    }
}
