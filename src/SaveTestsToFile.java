
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc109
 */
public class SaveTestsToFile {
    private String results;
    private String resultsContent="";

    
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
                resultsContent+="\n"+in.nextLine();
            }
        } catch (FileNotFoundException ex) {}
    }
    
    public void writeEventsToFile() {
             PrintWriter zapis=null;
        try {
            zapis = new PrintWriter("TestResults.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveTestsToFile.class.getName()).log(Level.SEVERE, null, ex);
        }
      zapis.println(resultsContent+"\n"+results);
      zapis.close();
    }
}
