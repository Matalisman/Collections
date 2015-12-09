
import java.util.LinkedHashSet;
import java.util.Map;

/**
 *
 * @author pc109
 */
public class CollectionsFactory {
 
    
    private Map times;
    public CollectionsFactory (String name, int amount){
       
        if(name == null) {
            throw new IllegalArgumentException("Path may not be null");
        }
        if (name == "ArrayList" ) {
            CreateArrayList arrayList = new CreateArrayList(amount);
         
            TestArrayList testArray = new TestArrayList(arrayList);
            Map times = testArray.ArrayListResults();
            
            this.times = times;
        }
        
        if (name == "LinkedList" ) {
            CreateLinkedList linkedList = new CreateLinkedList(amount);
         
            TestLinkedList testLinked = new TestLinkedList(linkedList);
            Map times = testLinked.LinkedListResults();
            
        
            this.times = times;
        }
        
        if (name == "HashSet" ) {
            CreateHashSet hashSet = new CreateHashSet(amount);
         
            TestHashSet testHashSet = new TestHashSet(hashSet);
            Map times = testHashSet.HashSetResults();
            
        
            this.times = times;
        }
        
        if (name == "LinkedHashSet" ) {
            CreateLinkedHashSet linkedHashSet = new CreateLinkedHashSet(amount);
         
            TestLinkedHashSet testLinkedHashSet = new TestLinkedHashSet(linkedHashSet);
            Map times = testLinkedHashSet.LinkedHashSetResults();
            
        
            this.times = times;
        }
        
        if (name == "TreeSet" ) {
            CreateTreeSet treeSet = new CreateTreeSet(amount);
         
            TestTreeSet testTreeSet = new TestTreeSet(treeSet);
            Map times = testTreeSet.TreeSetResults();
            
        
            this.times = times;
        }
          
    }
    
    public Map getOutput()
    {
        return this.times;
    }
}
