package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;


public class DivisaTest {

     @Test
    public void testSumar() throws Exception {
       System.out.println("SUMAR DIVISAS");
       
        Divisa divisaUNO = new Divisa(10, "Soles");
        Divisa divisaDOS = new Divisa(20, "Soles");
        Divisa divisaESPERADA = new Divisa(30, "Soles");
        
        Divisa divisaRESULTADO = divisaDOS.sumar(divisaUNO);
        assertEquals(divisaESPERADA.getImporte(), divisaRESULTADO.getImporte());

    }
/*
    @Test
    public void testSumar() throws Exception {
        System.out.println("sumar");
        Divisa d = new Divisa(10, "Soles");
        Divisa instance = new Divisa(20, "Soles");
        Divisa expResult = new Divisa(80, "Soles");
        Divisa result = instance.sumar(d);
        assertEquals(expResult, result);
    }
*/
    

    
    
     
   }
