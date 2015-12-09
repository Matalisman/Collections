
import java.util.Map;

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
 
    
    private Map times;
    public CollectionsFactory (String name, int amount){
       
        if(name == null) {
            throw new IllegalArgumentException("Path may not be null");
        }
        if (name == "ArrayList" ) {
            CreateArrayList arrayList = new CreateArrayList(amount);
            TestArrayList testArray = new TestArrayList(arrayList);
            Map times = testArray.ArrayListResults();
            
            this.times = times;
        }
          
    }
    
    public Map getOutput()
    {
        return this.times;
    }
}
