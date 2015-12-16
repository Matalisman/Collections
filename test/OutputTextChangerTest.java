/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karola
 */
public class OutputTextChangerTest {
    
    public OutputTextChangerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFormattedText method, of class OutputTextChanger.
     */
    @Test
    public void testGetFormattedText() {
        System.out.println("getFormattedText");
        String results = "";
        OutputTextChanger instance = new OutputTextChanger();
        String expResult = "";
        String result = instance.getFormattedText(results);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
