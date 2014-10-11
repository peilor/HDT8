/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 * Prueba unitaria de los métodos add y get de la implementación HashTable
 * Atencion: Se elaboró un solo método que prueba los dos métodos: add y get a la vez
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HashTableTest {
    
    public HashTableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testAddGet() {
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
}
