/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import exceptions.SaldoInsuficienteException;

/**
 *
 * @author T
 */
public class Saque extends Transacao {

    public Saque(int valor, Conta conta) {
        super((-1) * valor, conta); // valor vira negativo pois é uma retirada de dinheiro
    }

    public Conta sacar() throws SaldoInsuficienteException {
        if ((getValor() + getConta().getSaldo()) >= 0) {
            getConta().updateSaldo(getValor());
        } else {
            throw new SaldoInsuficienteException();
        }
        return getConta();
    }
    
    @Override
    public String toString(){
        return "SAQUE          "+getData().toString()+ "  "+getValor();
    }
}
