/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalTime;

/**
 *
 * @author T
 */
public class Saque extends Transacao {
    
    public Saque(int valor, Conta conta){
        super((-1)*valor, conta); // valor vira negativo pois é uma retirada de dinheiro
        if (valor<conta.getSaldo()) {
            conta.updateSaldo(conta.getSaldo() - valor);
        }   
        else
            System.out.println("Saldo insuficiente");
    }    
}
