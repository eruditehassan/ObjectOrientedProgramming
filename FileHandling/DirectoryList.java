import java.io.File;
public class DirectoryList {
    //This progam will list all files in the current working netbeans folder
    public static void main(String args[]){
        //Using "." to specify current folder location
        File directory= new File(".");
        //Storing list of files in an array
        File[] dirlist = directory.listFiles();
        //Printing out the list of files
        for (File i: dirlist ){
            System.out.println(i);
        }
    }
}
