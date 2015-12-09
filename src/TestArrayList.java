
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
    
    TestArrayList(ArrayList arrayList){
        this.arrayList = arrayList;
    }
    
    Map ArrayListResults(){
        
    Map resultTimes = new HashMap();
    
    resultTimes.put("Dodawanie", this.add());
    resultTimes.put("Usuwanie", this.remove());
    resultTimes.put("Sortowanie po Id", this.sort());
    resultTimes.put("Wybieranie", this.get());
    
    return resultTimes;
    
    }
    
    public long add()
    {
        long start =0;
        long stop = 0;
        RandomObjectsCreator randomer = new RandomObjectsCreator();
        RandomObject objectToAdd = randomer.createRandomObject();
        
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
    
    public long sort() {
      long start =0;
      long stop = 0;
      
      start = System.nanoTime();
      Collections.sort(arrayList, new SortObjectsById());
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
    
}
