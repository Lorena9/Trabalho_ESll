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
public class Transferencia extends Transacao {
    private String contaOrigem;
    private String contaDestino;
    
    public Transferencia(int valor, Conta conta){
        super(valor, conta);
    }
}
