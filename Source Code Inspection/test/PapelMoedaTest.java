
import br.calebe.ticketmachine.core.PapelMoeda;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 31548751
 */
public class PapelMoedaTest {
    
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
