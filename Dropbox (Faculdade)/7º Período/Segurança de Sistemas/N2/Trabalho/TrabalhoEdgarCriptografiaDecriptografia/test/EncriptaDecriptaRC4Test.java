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
 * @author ~WallysonTobias
 */
public class EncriptaDecriptaRC4Test {
    
    public EncriptaDecriptaRC4Test() {
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
     * Test of decriptografa method, of class EncriptaDecriptaRC4.
     */
    @Test
    public void testDecriptografa() {
        System.out.println("decriptografa");
        char[] msg = null;
        EncriptaDecriptaRC4 instance = new EncriptaDecriptaRC4();
        char[] expResult = null;
        char[] result = instance.decriptografa(msg);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of criptografa method, of class EncriptaDecriptaRC4.
     */
    @Test
    public void testCriptografa() {
        System.out.println("criptografa");
        char[] msg = null;
        EncriptaDecriptaRC4 instance = new EncriptaDecriptaRC4();
        char[] expResult = null;
        char[] result = instance.criptografa(msg);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setKey method, of class EncriptaDecriptaRC4.
     */
    @Test
    public void testSetKey() throws Exception {
        System.out.println("setKey");
        String key = "";
        EncriptaDecriptaRC4 instance = new EncriptaDecriptaRC4();
        instance.setKey(key);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
