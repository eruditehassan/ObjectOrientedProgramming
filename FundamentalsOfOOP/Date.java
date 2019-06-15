public class Date {
    int month,day,year;
    Date(int d,int m,int y){
        day = d;
        month = m;
        year = y;
    }
    public void displayDate(int m,int d,int y){
        System.out.printf("%d/%d/%d\n",m,d,y);
    }
}
class DateTest {
    //This program will test the Date class
    public static void main(String args[]){
        Date date1 = new Date(2,13,2019); //Date object
        date1.displayDate(2, 13, 2019); //Calling the displayDate method
    } 
}
