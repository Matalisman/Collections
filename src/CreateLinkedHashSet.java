
import java.util.LinkedHashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
public class CreateLinkedHashSet extends LinkedHashSet {
    
    CreateLinkedHashSet(int amount)
    {
        LinkedHashSet<RandomObject> list = new LinkedHashSet();
        for (int i = 0; i<amount; i++){
           this.add(new RandomObjectsCreator().createRandomObject());
        }  
    }    
}
