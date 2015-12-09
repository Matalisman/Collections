
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
class CreateTreeSet extends TreeSet {
    
    CreateTreeSet(int amount)
    {
        TreeSet<RandomObject> list = new TreeSet<RandomObject>(new SortObjectsById());
        for (int i = 0; i<amount; i++){
           this.add(new RandomObjectsCreator().createRandomObject());
        }  
    }    
}
