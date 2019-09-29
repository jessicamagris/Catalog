/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio10;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jessi
 */
public class Esercizio10Test {
  /*  
    public Esercizio10Test() {
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
*/
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestCatalog() {
                String in=   "<prod><name>drill</name><prx>99</prx><qty>5</qty></prod>\n\n" +
            "<prod><name>hammer</name><prx>10</prx><qty>50</qty></prod>\n\n" +
            "<prod><name>screwdriver</name><prx>5</prx><qty>51</qty></prod>\n\n" +
            "<prod><name>table saw</name><prx>1099.99</prx><qty>5</qty></prod>\n\n" +
            "<prod><name>saw</name><prx>9</prx><qty>10</qty></prod>\n\n" +
            "<prod><name>chair</name><prx>100</prx><qty>20</qty></prod>\n\n" +
            "<prod><name>fan</name><prx>50</prx><qty>8</qty></prod>\n\n";
                String out="drill > prx: $ 99 qty: 5 \n" +
"hammer > prx: $ 10 qty: 50 \n" +
"screwdriver > prx: $ 5 qty: 51 \n" +
"table saw > prx: $ 1099.99 qty: 5 \n" +
"saw > prx: $ 9 qty: 10 \n" +
"chair > prx: $ 100 qty: 20 \n" +
"fan > prx: $ 50 qty: 8 \n";
         assertEquals(Esercizio10.catalog(in), out);
     }
}
