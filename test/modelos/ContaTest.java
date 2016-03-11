/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Barbara
 */
public class ContaTest {
    
    Conta conta;
    
    public ContaTest() {
        conta = new Conta("123", 2000);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSaldo method, of class Conta.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        int expResult = 2000;
        int result = conta.getSaldo();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(Integer.toString(expResult), Integer.toString(result));
        // TODO review the generated test code and remove the default call to fail.
        fail("Erro em getSaldo()");
    }

    /**
     * Test of updateSaldo method, of class Conta.
     */
    @Test
    public void testUpdateSaldo() {
        System.out.println("updateSaldo");
        int valor = 300;
        int saldoAnterior = conta.getSaldo();
        conta.updateSaldo(300);
        assertEquals(saldoAnterior + valor, conta.getSaldo());
        // TODO review the generated test code and remove the default call to fail.
        fail("Erro em updateSaldo");
    }

    /**
     * Test of getNumero method, of class Conta.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        String expResult = "123";
        String result = conta.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Erro em getNumero");
    }

    /**
     * Test of getSaldoString method, of class Conta.
     */
    @Test
    public void testGetSaldoString() {
        System.out.println("getSaldoString");
        String expResult = "R$20,00";
        String result = conta.getSaldoString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Erro em getSaldoString");
    }

    /**
     * Test of deposita method, of class Conta.
     */
    @Test
    public void testDepositoRejeitado() {
        System.out.println("deposita");
        String agencia = "";
        String numConta = "";
        int valor = 30000;
        boolean expResult = false;
        boolean result = conta.deposita(agencia, numConta, valor);
        assertEquals(expResult, result);
    }
    
    public void testDepositoAprovado() {
        System.out.println("deposita");
        String agencia = "";
        String numConta = "";
        int valor = 300;
        boolean expResult = true;
        boolean result = conta.deposita(agencia, numConta, valor);
        assertEquals(expResult, result);
    }
    
}
