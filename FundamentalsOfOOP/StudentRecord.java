public class StudentRecord {
    //Defining instance variables
     private int student_id;
     private int marks;
     
     public static void main(String args[]){
         //Defining main method
        int totalmarks=0;
        double average=0;
        //Defining an array with 7 objects
        Student[] studentArray = new Student[7];
        for (int i = 0; i < studentArray.length; i++){
            //Creating objects
            studentArray[i] = new Student();
        }
        //Storing values of marks
        studentArray[0].marks = 56;
        studentArray[1].marks = 65;
        studentArray[2].marks = 87;
        studentArray[3].marks = 25;
        studentArray[4].marks = 98;
        studentArray[5].marks = 50;
        studentArray[6].marks = 74;
        //Storing student ids
        studentArray[0].student_id = 1;
        studentArray[1].student_id = 2;
        studentArray[2].student_id = 3;
        studentArray[3].student_id = 4;
        studentArray[4].student_id = 5;
        studentArray[5].student_id = 6;
        studentArray[6].student_id = 7;
        
        for (int i = 0; i < studentArray.length; i++) {
            //Caclulating total marks
            totalmarks += studentArray[i].marks;
        }
        //Calculating average
        average = (double) totalmarks/studentArray.length;
        //Printing average
        System.out.println("The average marks are: "+average);
    }
}
