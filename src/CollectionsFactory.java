/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc109
 */
public class CollectionsFactory {
 
    String output = "";
    public CollectionsFactory (String name, int amount){
       
        if(name == null) {
            throw new IllegalArgumentException("Path may not be null");
        }
        if (name == "ArrayList" ) {
            CreateArrayList arrayList = new CreateArrayList();
            arrayList.getArrayList(amount);
            
            //output = arrayList.read();
        }

    }
    
    public String getOutput()
    {
        return output;
    }
}
