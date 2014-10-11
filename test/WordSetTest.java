/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Héctor
 */
public class WordSetTest {
    
    public WordSetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class WordSet.
     */
    @Test
    public void testAddGet1() {
        System.out.println("add");
        
        // Prueba para implementación 1: simpleSet. Se prueban los métodos add y get. 
        WordSet instance =  WordSetFactory.generateSet(1);
        Word wordObject = new Word("HOLA", "MUNDO");
        Word wordObject2 = new Word("HOLA", "MUNDO");
        instance.add(wordObject);
        Word variable = instance.get(wordObject);
        assertEquals(variable, wordObject);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddGet2() {
        System.out.println("add");
        
         // Prueba para implementación 2: redBlackTree. Se prueban los métodos add y get.
        WordSet instance =  WordSetFactory.generateSet(2);
        Word wordObject = new Word("HOLA", "MUNDO");
        Word wordObject2 = new Word("HOLA", "MUNDO");
        instance.add(wordObject);
        Word variable = instance.get(wordObject);
        assertEquals(variable, wordObject);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @Test
    public void testAddGet3() {
        System.out.println("add");
        
         // Prueba para implementación 3: splayTree. Se prueban los métodos add y get.
        WordSet instance =  WordSetFactory.generateSet(3);
        Word wordObject = new Word("HOLA", "MUNDO");
        Word wordObject2 = new Word("HOLA", "MUNDO");
        instance.add(wordObject);
        Word variable = instance.get(wordObject);
        assertEquals(variable, wordObject);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testAddGet4() {
        System.out.println("add");
        
         // Prueba para implementación 3: splayTree. Se prueban los métodos add y get.
        WordSet instance =  WordSetFactory.generateSet(4);
        Word wordObject = new Word("HOLA", "MUNDO");
        Word wordObject2 = new Word("HOLA", "MUNDO");
        instance.add(wordObject);
        Word variable = instance.get(wordObject);
        assertEquals(variable, wordObject);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    public void testAddGet5() {
        System.out.println("add");
        
         // Prueba para implementación 3: splayTree. Se prueban los métodos add y get.
        WordSet instance =  WordSetFactory.generateSet(5);
        Word wordObject = new Word("HOLA", "MUNDO");
        Word wordObject2 = new Word("HOLA", "MUNDO");
        instance.add(wordObject);
        Word variable = instance.get(wordObject);
        assertEquals(variable, wordObject);
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of get method, of class WordSet.
     */
    
}
