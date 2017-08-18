/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sem2;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author kasper
 */
public class Sem2HashMapTest {
    
    @Test
    public void testGet() {
        System.out.println( "get" );
        String key = "";
        Sem2HashMap instance = new Sem2HashMap();
        Address expResult = null;
        Address result = instance.get( key );
        assertEquals( expResult, result );
    }

    @Test
    public void testPut() {
        System.out.println( "put" );
        String key = "";
        Address value = null;
        Sem2HashMap instance = new Sem2HashMap();
        instance.put( key, value );
        fail( "Her mangler vi at skrive en test - det er blot en skabelon" );
    }

    @Test
    public void testContainsKey() {
        System.out.println( "containsKey" );
        String key = "Jensen";
        Sem2HashMap instance = new Sem2HashMap();
        boolean expResult = false;
        boolean result = instance.containsKey( key );
        assertEquals( expResult, result );
    }

    @Test
    public void testSize0() {
        System.out.println( "size" );
        Sem2HashMap instance = new Sem2HashMap();
        int expResult = 0;
        int result = instance.size();
        assertEquals( expResult, result );
    }
    
        @Test
    public void testSize1() {
        System.out.println( "size" );
        Sem2HashMap instance = new Sem2HashMap();
        instance.put("Joe", new Address("Nowhere 9"));
        int expResult = 1;
        int result = instance.size();
        assertEquals( expResult, result );
    }

    @Test
    public void testValues() {
        System.out.println( "values" );
        Sem2HashMap instance = new Sem2HashMap();
        List<Address> expResult = null;
        List<Address> result = instance.values();
        assertEquals( expResult, result );
    }
    
}
