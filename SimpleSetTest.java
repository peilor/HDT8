/**
 * @author Pablo Argueta, Carnet: 13028
 * @author Héctor Möller, Carnet: 09002
 * @author Brandon Mendez, Carnet: 13087
 * 
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleSetTest {
    
    public SimpleSetTest() {
    }

    /**
     * Test del método Get
     */
    @Test
    public void testGet() {
        System.out.println("Prueba de metodo: get");
        Word word = new Word('Carro','n');
        SimpleSet instance = new SimpleSet();
        Word expResult = null;
        Word result = instance.get(word);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test del método Add
     */
    @Test
    public void testAdd() {
        System.out.println("Prueba de metodo: add");
        Word word2 = new Word('Perro','n');
        SimpleSet instance = new SimpleSet();
        instance.add(word2);
		Word result = instance.get(word);
        assertEquals(word2, result);
        //fail("The test case is a prototype.");
    }
}