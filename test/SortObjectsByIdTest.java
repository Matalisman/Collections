/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karola
 */
public class SortObjectsByIdTest {
    
  
    /**
     * Test of compare method, of class SortObjectsById.
     */
    @Test
    public void testCompare() {
       SortObjectsById comparator = new SortObjectsById();
        Assert.assertEquals(0, comparator.compare(new RandomObject(123, "Pierwszy"), new RandomObject(123, "Drugi")));
        Assert.assertEquals(1, comparator.compare(new RandomObject(111, "Pierwszy"), new RandomObject(123, "Drugi")));
        Assert.assertEquals(-1, comparator.compare(new RandomObject(123, "Pierwszy"), new RandomObject(111, "Drugi")));
        
        System.out.println("compareById");
       
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
