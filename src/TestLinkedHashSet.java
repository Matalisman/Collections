
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
class TestLinkedHashSet {
    private final LinkedHashSet linkedHashSet;
    
    
    RandomObjectsCreator randomer = new RandomObjectsCreator();
    RandomObject objectToAdd = randomer.createRandomObject();
    
    TestLinkedHashSet(LinkedHashSet linkedHashSet){
        this.linkedHashSet = linkedHashSet;
    }
    
    Map LinkedHashSetResults(){
        
    Map resultTimes = new HashMap();
    
    resultTimes.put("Dodawanie", this.add());
    resultTimes.put("Wybieranie", "Brak indeksu");
    resultTimes.put("Czy zawiera? ", this.contains());
    resultTimes.put("Usuwanie", this.remove());
    resultTimes.put("Sortowanie po Id", "Brak sortowania");
    
    return resultTimes;
    
    }
    
    public long add()
    {
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedHashSet.add(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long remove(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedHashSet.remove(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long contains(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        linkedHashSet.contains(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
}

