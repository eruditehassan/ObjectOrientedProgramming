public class Employee {
    //The employee class
    //Defining main variables to be used in the program
    String firstname,lastname;
    double salary;
    double yearsalary;
    double raisedsalary;
    Employee(String fname, String lname, double msalary){
        //Defining the constructor
        if (msalary <0){
            //Specified condition
            salary = 0;
            firstname = fname;
            lastname = lname;            
      }
        else{
            //In case the condition doesn't fulfill
            firstname = fname;
            lastname = lname;
            salary = msalary;
        }
    }         
double YearlySalary(double msalary){
        //Method to calculate yearly Salary
        yearsalary = msalary*12;
        return yearsalary; //Returning yearly salary
    }
    double Raise(double year_salary){
        //Method to calculate raised salary
        raisedsalary = (year_salary) + (year_salary * .10); //increment is 10%
        return raisedsalary; //Returning the raised salary
    }
}

class EmployeeTest {
    //This program will test the Employee class
    public static void main(String args[]){
        //Main method to execute
        Employee employee1 = new Employee("James","Bond",2000); //First Object
        Employee employee2 = new Employee("Johnny","English",2000); //Second Object
        employee1.yearsalary = employee1.YearlySalary(employee1.salary); //Calculating Yearly salary
        employee2.yearsalary = employee2.YearlySalary(employee2.salary);
        employee1.raisedsalary = employee1.Raise(employee1.yearsalary); //Calculating Raised Salary
        employee2.raisedsalary = employee2.Raise(employee2.yearsalary);
        //Printing out details
        System.out.printf("The Details of Employee 1 are:\n Name: %s %s\n Yearly Salary: %.3f\n Raised Yearly Salary: %.3f\n",employee1.firstname,employee1.lastname,employee1.yearsalary,employee1.raisedsalary);
        System.out.printf("The Details of Employee 2 are:\n Name: %s %s\n Yearly Salary: %.3f\n Raised Yearly Salary: %.3f\n",employee2.firstname,employee2.lastname,employee2.yearsalary,employee2.raisedsalary);
    }
}
