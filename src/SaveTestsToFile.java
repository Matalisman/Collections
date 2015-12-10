import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

/**
 *
 * @author pc109
 */
public class SaveTestsToFile {
    
    private String results;
    private ArrayList<String> resultsContent=new ArrayList();

    
    SaveTestsToFile(String results) {
        this.results = results;
        this.readEventsFromFile();
        this.writeEventsToFile();
    }        
    public void readEventsFromFile(){
        try {
            File file = new File("TestResults.txt");
            Scanner in = new Scanner(file);

            while(in.hasNextLine()){
                resultsContent.add(in.nextLine());
            }
        } catch (FileNotFoundException ex) {}
    }
    
    public void writeEventsToFile() {
             PrintWriter saveFile=null;
        try {
            saveFile = new PrintWriter("TestResults.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveTestsToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(!resultsContent.isEmpty()){
            for(int i=0; i<resultsContent.size();i++){
               saveFile.println(resultsContent.get(i));
            }
            saveFile.println("");
        }
      saveFile.println(results);
      saveFile.close();
    }
}
