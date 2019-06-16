import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;
public class StudentsData {
    private Scanner input;
    public static void main(String args[]){
        studentReadWrite("File Location here");
    }
    
    public static void studentReadWrite(String path){
        int noOfStudents = 0;
        String[] fName;
        String[] lName;
        String[] email;
        Scanner input;
        int[] regNo;
        int count=0;
        
        Formatter output;
        
        
        try{
        File file = new File(path+"\\Students.txt");        
        input = new Scanner(file);
        noOfStudents = Integer.parseInt(input.next());
        fName = new String [noOfStudents];
        lName = new String[noOfStudents];
        email = new String[noOfStudents];
        regNo = new int[noOfStudents];
        
        output = new Formatter(path+"\\UpdatedStudents.txt");
        output.format("%d%n",noOfStudents);
        while(input.hasNext()){
            fName[count] = input.next();
            lName[count] = input.next();
            email[count] = input.next();
            regNo[count] = input.nextInt();

            output.format("%-4d%-25s%-10s%-10s%n",regNo[count],email[count],fName[count],lName[count]);
            
            
            count++;
        }
        output.close();
        System.out.println("Read from the file and written to updated file Successfully!");
        
        

    }
        catch(IOException | NumberFormatException ex){
            System.out.println(ex);
        }
    
}
}
