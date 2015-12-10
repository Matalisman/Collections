
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    
    SaveTestsToFile(String results) {
        this.results = results;
    }
    
    
   public void recordEvents(){
       String fileContent = this.readEventsFromFile();
       this.addNewEventToLists(results);
       this.writeEventsToFile(fileContent);
       this.displayPriorities(fileContent);
   }
   
   
        
    public String readEventsFromFile(){
        
        String resultsContent = new String();
        ObjectInputStream resultsSavedInFile=null ;
        
            try {
                resultsSavedInFile = new ObjectInputStream(new FileInputStream("Event.dat"));
            } catch (FileNotFoundException e) {
                    } catch (IOException ex) {
                        Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
            try {
                resultsContent = (ArrayList<Event>) resultsSavedInFile.readObject();
            } catch (NullPointerException e) {
                } catch (ClassNotFoundException | IOException ex) {
                        Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        return resultsContent;
    }
    
    public void writeEventsToFile(String eventContent) {
        ObjectOutputStream saveNewEvents = null;
        try {
            saveNewEvents = new ObjectOutputStream(new FileOutputStream("Event.dat"));
        } catch (IOException ex) {
            Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            saveNewEvents.writeObject(resultsContent);
        } catch (IOException ex) {
            Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void addNewEventToLists(String results){
        String saveEvent = new String(results);
        resultsContent.add(saveEvent);
    }
    

    
    public void displayPriorities(String resultsContent){
        
            System.out.println(resultsContent);
            
    }
}
