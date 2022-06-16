/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficzne;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arek
 */
public class ukladTest {
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    
    

    /**
     * Test of main method, of class Uklad.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Uklad.main(args);
    }

    /**
     * Test of move_planet method, of class Uklad.
     */
    @Test
    public void testMove_planet() {
        
        Uklad uklad = new Uklad();
        Assert.assertNotNull(uklad.move_planet(0, 0));
    }
    
    /**
     * Test of setXPos method, of class Uklad.
     */
    @Test
    public void testsetXPos() {
        
        Uklad uklad = new Uklad();
        Assert.assertNotNull(uklad.setXPos(0, 0, 0));
    }
    
    /**
     * Test of setYPos method, of class Uklad.
     */
    @Test
    public void testsetYPos() {
        
        Uklad uklad = new Uklad();
        Assert.assertNotNull(uklad.setYPos(1, 1, 1));
    }
    
}
