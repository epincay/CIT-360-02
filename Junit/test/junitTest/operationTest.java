/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eddie Pincay
 */
public class operationTest {
    
    public operationTest() {
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
     * Test of addition/subtraction method, of class operation.
     */
    @Test
    public void testSum() {
        System.out.println("Addition Test");

        int a = 10;
        int b = 4;
        
        int expResult = 14;
         
        
        int result = operation.addition(a, b);
        
        assertEquals(expResult, result);
        System.out.println("OK");   
                
    }
    
    @Test
    public void testSub() {
        System.out.println("Subtraction Test");

        int a = 10;
        int b = 4;
        
        int expResult = 6;
         
        
        int result = operation.subtraction(a, b);
        
        assertEquals(expResult, result);
        System.out.println("OK");
    
    }
    
            
    @Test
    public void testAssertEquals() {
        System.out.println("testAssertEquals");
        String obj1 = "junit";
        String obj2 = "junit";
        
        assertEquals(obj1, obj2);
    }
    
    @Test
    public void testAssertSame() {
        System.out.println("testAssertSame");
        String obj1 = "junit";
        String obj2 = "junit";

        assertSame(obj1, obj1);
    }
    
    @Test
    public void testAssertNotSame() {
        System.out.println("testAssertNotSame");
        String obj1 = "junit";
        String obj3 = "test";

        assertNotSame(obj1, obj3);
    }

    @Test
    public void testAssertNotNull() {
        System.out.println("testAssertNotNull");
        String obj1 = "junit";
       
        assertNotNull(obj1);
    }
     
    @Test
    public void testAssertNull() {
        System.out.println("testAssertNull");
        String obj5 = null;

        assertNull(obj5);
    }
      
    @Test
    public void testAssertTrue() {
        System.out.println("testAssertTrue");
        Boolean var1 = true;
       
        assertTrue("Th condition is true!", var1);
    }
    
    @Test
    public void testAssertArrayEquals() {
        System.out.println("testAssertArrayEquals");
        int[] arithmetic1 = { 89, 30, 43 };
        int[] arithmetic2 = { 89, 30, 43 };

        assertArrayEquals(arithmetic1, arithmetic2);
    }
    
    
}
