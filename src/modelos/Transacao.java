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
public class Transacao {
    private Conta conta;
    private LocalTime data;
    private int valor; //obs: valor em centavos de real! Considerar duas casas decimais!
    
    public Transacao(int valor, Conta conta){
        this.conta = conta;
        this.valor = valor;
        data = LocalTime.now();
    }
    
    public int getValor(){
        return valor;
    }
    
    public LocalTime getData(){
        return data;
    }

    public Conta getConta() {
        return conta;
    }
    
}
