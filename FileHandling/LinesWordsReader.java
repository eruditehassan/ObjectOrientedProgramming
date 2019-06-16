import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class LinesWordsReader {

    public static void main(String args[]) {
        reader("file.txt");
    }

    public static void reader(String path) {
        String text;
        int lines=0;
        int words=0;
        try {
            File f = new File(path);
            FileInputStream stream = new FileInputStream(f);
            InputStreamReader streamReader = new InputStreamReader(stream);
            BufferedReader buffer = new BufferedReader(streamReader);
            while ((text = buffer.readLine()) != null) {
                String[] wordList = text.split("\\s+");
                words += wordList.length;
                String[] lineList = text.split("line.seperator");
                lines += lineList.length;
                

            }
            System.out.println("Number of lines are: "+lines);
            System.out.println("Number of words are: "+words);      
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        
    }}
