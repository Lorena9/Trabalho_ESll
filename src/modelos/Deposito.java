/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import basededados.dao.DepositoDAO;

/**
 *
 * @author T
 */
public class Deposito {
    //private String tipoConta;
   // private String tipoDeposito;
    DepositoDAO deposito;
      
    public Deposito(int valor, Conta conta){
        //super(valor, conta);
        deposito = new DepositoDAO();
    }

    Deposito() {

    }
    
    public boolean deposita(String agencia, String conta, int valor) {
        
        int valorAtual = deposito.getSaldo(conta, valor);
        System.out.println("Executando deposito: valorAtual:" +valorAtual);
        //soma
//        deposito.atualizaConta(conta);
        return true;
    }
  
}
