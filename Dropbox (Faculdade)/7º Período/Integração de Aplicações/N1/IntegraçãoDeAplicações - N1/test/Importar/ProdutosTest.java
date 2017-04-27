/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Importar;

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
public class ProdutosTest {
    
    public ProdutosTest() {
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
     * Test of getCprod method, of class Produtos.
     */
    @Test
    public void testGetCprod() {
        System.out.println("getCprod");
        Produtos instance = new Produtos();
        Long expResult = null;
        Long result = instance.getCprod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCprod method, of class Produtos.
     */
    @Test
    public void testSetCprod() {
        System.out.println("setCprod");
        Long cprod = null;
        Produtos instance = new Produtos();
        instance.setCprod(cprod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXprod method, of class Produtos.
     */
    @Test
    public void testGetXprod() {
        System.out.println("getXprod");
        Produtos instance = new Produtos();
        String expResult = "";
        String result = instance.getXprod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXprod method, of class Produtos.
     */
    @Test
    public void testSetXprod() {
        System.out.println("setXprod");
        String xprod = "";
        Produtos instance = new Produtos();
        instance.setXprod(xprod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQcom method, of class Produtos.
     */
    @Test
    public void testGetQcom() {
        System.out.println("getQcom");
        Produtos instance = new Produtos();
        Integer expResult = null;
        Integer result = instance.getQcom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQcom method, of class Produtos.
     */
    @Test
    public void testSetQcom() {
        System.out.println("setQcom");
        Integer qcom = null;
        Produtos instance = new Produtos();
        instance.setQcom(qcom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVuncom method, of class Produtos.
     */
    @Test
    public void testGetVuncom() {
        System.out.println("getVuncom");
        Produtos instance = new Produtos();
        Double expResult = null;
        Double result = instance.getVuncom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVuncom method, of class Produtos.
     */
    @Test
    public void testSetVuncom() {
        System.out.println("setVuncom");
        Double vuncom = null;
        Produtos instance = new Produtos();
        instance.setVuncom(vuncom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVprod method, of class Produtos.
     */
    @Test
    public void testGetVprod() {
        System.out.println("getVprod");
        Produtos instance = new Produtos();
        Double expResult = null;
        Double result = instance.getVprod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVprod method, of class Produtos.
     */
    @Test
    public void testSetVprod() {
        System.out.println("setVprod");
        Double vprod = null;
        Produtos instance = new Produtos();
        instance.setVprod(vprod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
