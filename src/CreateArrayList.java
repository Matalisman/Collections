
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc109
 */
public class CreateArrayList extends ArrayList {
    
    CreateArrayList(int amount)
    {
        ArrayList<RandomObject> list = new ArrayList();
        RandomObjectsCreator object;
        for (int i = 0; i<amount; i++){
           this.add(new RandomObjectsCreator());
        }
                
    }
}
