/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
public class TestArrayListTest {
    
    private CreateArrayList arrayList;
    
    
    
    public TestArrayListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arrayList = new CreateArrayList(1100);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ArrayListResults method, of class TestArrayList.
     */
    @Test
   public void testArrayListResults() {
       

        TestArrayList testArray = new TestArrayList(arrayList);

        Assert.assertEquals(new HashMap().getClass(), testArray.ArrayListResults().getClass() );
      
        System.out.println("ArrayList Test");  
    }
//
    /**
     * Test of add method, of class TestArrayList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        TestArrayList testArray = new TestArrayList(arrayList);
        long expResult = 1101;
        testArray.add();
        assertEquals(arrayList.size(), expResult);
        
    }

    /**
     * Test of remove method, of class TestArrayList.
     */
    @Test
    public void testRemove() {
       System.out.println("remove");
        TestArrayList testArray = new TestArrayList(arrayList);
        long expResult = 1099;
        testArray.remove();
        assertEquals(arrayList.size(), expResult);
    }
}
