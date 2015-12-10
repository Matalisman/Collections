
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
class TestLinkedList implements CollectionInterface  {
    
    private final LinkedList linkedList;
    private RandomObjectsCreator randomer = new RandomObjectsCreator();
    private RandomObject objectToAdd = randomer.createRandomObject();
    
    TestLinkedList(LinkedList linkedList){
        this.linkedList = linkedList;
    }
    
    Map  LinkedListResults(){
        
    Map resultTimes = new HashMap();
    
    resultTimes.put("Dodawanie", this.add());
    resultTimes.put("Wybieranie", this.get());
    resultTimes.put("Czy zawiera? ", this.contains());
    resultTimes.put("Usuwanie", this.remove());
    resultTimes.put("Sortowanie po Id", this.sortById());
    resultTimes.put("Sortowanie po Name", this.sortByName());
    
    
    return resultTimes;
    
    }
    
    public long add()
    {
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedList.add(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long remove(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedList.remove(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        
        return time;
    }
    
    public long sortById() {
      long start =0;
      long stop = 0;
      
      start = System.nanoTime();
      Collections.sort(linkedList, new SortObjectsById());
      stop = System.nanoTime();
        
      long time= stop-start;
        
        
      return time;  
    }
    
    public long sortByName() {
      long start =0;
      long stop = 0;
      
      start = System.nanoTime();
      Collections.sort(linkedList, new SortObjectsByName());
      stop = System.nanoTime();
        
      long time= stop-start;
        
        
      return time;  
    }
    
    public long get(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedList.get(1000);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long contains(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedList.contains(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
}
