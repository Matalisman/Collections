
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
public class CreateLinkedList extends LinkedList {
    
    CreateLinkedList(int amount)
    {
        LinkedList<RandomObject> list = new LinkedList();
        for (int i = 0; i<amount; i++){
           this.add(new RandomObjectsCreator().createRandomObject());
        }  
    }
}
