/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author T
 */
public class Deposito extends Transacao {
    //private String tipoConta;
   // private String tipoDeposito;
      
    public Deposito(int valor, Conta conta){
        super(valor, conta);
    }
}
