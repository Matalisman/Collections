
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static javax.management.Query.times;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
public class TestArrayList {
    
    private final ArrayList arrayList;
    private RandomObjectsCreator randomer = new RandomObjectsCreator();
    private RandomObject objectToAdd = randomer.createRandomObject();
    
    TestArrayList(ArrayList arrayList){
        this.arrayList = arrayList;
    }
    
    Map ArrayListResults(){
        
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
        arrayList.add(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long remove(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        arrayList.remove(1000);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        
        return time;
    }
    
    public long sortById() {
      long start =0;
      long stop = 0;
      
      start = System.nanoTime();
      Collections.sort(arrayList, new SortObjectsById());
      stop = System.nanoTime();
        
      long time= stop-start;
        
        
      return time;  
    }
    
    public long sortByName() {
      long start =0;
      long stop = 0;
      
      start = System.nanoTime();
      Collections.sort(arrayList, new SortObjectsByName());
      stop = System.nanoTime();
        
      long time= stop-start;
        
        
      return time;  
    }
    
    public long get(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        arrayList.get(1000);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long contains(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        arrayList.contains(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
}
