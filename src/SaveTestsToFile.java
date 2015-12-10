
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
    private String read; 

    
    SaveTestsToFile(String results) {
        this.results = results;
    }
    
    public void saveResults() {
        try {
            this.FileReaderDemo();
            File file = new File("test.txt");
            FileWriter fileWriter = new FileWriter(file);
            
            
            System.out.println("W saveResults");
            fileWriter.write(read);
            fileWriter.write(results);
            fileWriter.flush();
            fileWriter.close();
            } catch (IOException e) {
		}      
    }
    
    public void FileReaderDemo() throws FileNotFoundException, IOException{
       
        FileReader fr = new FileReader("test.txt"); 
        BufferedReader br = new BufferedReader(fr); 
        
        while((read = br.readLine()) != null) { 
        System.out.println(read); 
        } 
        fr.close(); 
        } 
        
}
