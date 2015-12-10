
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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
class TestTreeSet implements CollectionInterface  {
    
    private final TreeSet treeSet;
    private RandomObjectsCreator randomer = new RandomObjectsCreator();
    private RandomObject objectToAdd = randomer.createRandomObject();
    
    TestTreeSet(TreeSet treeSet){
        this.treeSet = treeSet;
    }
    
    Map TreeSetResults(){
        
    Map resultTimes = new HashMap();
    
    resultTimes.put("Dodawanie", this.add());
    resultTimes.put("Wybieranie", "Brak indeksu");
    resultTimes.put("Czy zawiera? ", this.contains());
    resultTimes.put("Usuwanie", this.remove());
    resultTimes.put("Sortowanie po Id", "Posortowane od razu");
    resultTimes.put("Sortowanie po Name", "Brak sortowania");
    
    return resultTimes;
    
    }
    
    public long add()
    {
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        treeSet.add(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }
    
    public long remove(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        treeSet.remove(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        
        return time;
    }
      
    public long contains(){
        long start =0;
        long stop = 0;
        
        start = System.nanoTime();
        treeSet.contains(objectToAdd);
        stop = System.nanoTime();
        
        long time= stop-start;
        
        return time;
    }

    @Override
    public long get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long sortById() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long sortByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
