/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados;

import java.sql.Date;
import java.util.ArrayList;
import modelos.Conta;
import modelos.Transacao;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class ContaDAOTest {
    
    public ContaDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getExtratoInicial method, of class ContaDAO.
     */
    @Test
    public void testGetExtratoInicial() {
        System.out.println("getExtratoInicial");
        String agencia = "";
        String conta = "";
        ContaDAO instance = new ContaDAO();
        String expResult = "";
        String result = instance.getExtratoInicial(agencia, conta);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSaldo method, of class ContaDAO.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        String conta = "";
        int valorDeposito = 0;
        ContaDAO instance = new ContaDAO();
        int expResult = 0;
        int result = instance.getSaldo(conta, valorDeposito);
        assertEquals(expResult, result);
    }

    /**
     * Test of deposita method, of class ContaDAO.
     */
    @Test
    public void testDeposita() {
        System.out.println("deposita");
        String agencia = "";
        String conta = "";
        java.util.Date data = null;
        int valor = 0;
        ContaDAO instance = new ContaDAO();
        boolean expResult = false;
        boolean result = instance.deposita(agencia, conta, data, valor);
        assertEquals(expResult, result);
   }
    
}
