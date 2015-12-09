
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
class CreateHashSet extends HashSet {
    
    CreateHashSet(int amount)
    {
        HashSet<RandomObject> list = new HashSet();
        for (int i = 0; i<amount; i++){
           this.add(new RandomObjectsCreator().createRandomObject());
        }  
    }    
}
