/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import static junit.framework.Assert.assertEquals;
/*
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
*/
import org.junit.Test;

/**
 *
 * @author 31548751
 */
public class PapelMoedaTest {
    /*
    public PapelMoedaTest() {
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
    // @Test
    // public void hello() {}
    
    @Test
    public void getValorTest(){
        PapelMoeda pm = new PapelMoeda(5,1);
        assertEquals(pm.getValor(),5);
    }
    
    @Test
    public void getQuantidadeTest(){
        PapelMoeda pm = new PapelMoeda(10,11);
        assertEquals(pm.getValor(),10);
    }
    
}
