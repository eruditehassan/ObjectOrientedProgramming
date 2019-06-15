public class TestPerson {
    //This class tests the capabilities of the Person class
    public static void main(String args[]){
        //Creating all the necessary objects to be used in Faculty class
        //Creating JobDescription object
        JobDescription jd1 = new JobDescription("Professor",100000,15);
        //Creating HiringDate object
        HiringDate hd1 = new HiringDate(11,1,2011);
        //Creating Faculty object
        Faculty imran = new Faculty("Mr. Imran", "363020000000000","abc@abc.com","030078601","090078601",jd1,hd1);
        //Creating student object
        Student hassan = new Student("Hassan", "363020010000000","abc@nust.com","030079501","Freshman",200000);
        
        //Printing details about Faculty Member
        System.out.println("Details about Faculty Member:");
        System.out.println("Name: "+imran.getName()+"\nCNIC: "+imran.getCNIC()+"\nEmail: "+imran.getEmail()+"\nPhone: "+imran.getNumber()+"\nOffice Number: "+
                imran.getOfficeNumber() + jd1.getJobDescription()+"\n"+ hd1.getHiringDate());
        System.out.println();
        //Printing out details about Student object
        System.out.println("Details about Student:");
        System.out.println("Name: "+hassan.getName()+"\nCNIC: "+hassan.getCNIC()+"\nEmail: "+hassan.getEmail()+"\nPhone: "+hassan.getNumber()
                +"\nBatch:"+hassan.getBatch()+"\nRegistration Number: "+hassan.getRegNumber());
    }
    
}
