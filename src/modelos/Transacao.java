/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

/**
 *
 * @author T
 */
public class Transacao {
    private Conta conta;
    private Date data;
    private int valor; //obs: valor em centavos de real! Considerar duas casas decimais!
    
    public Transacao(int valor, Conta conta){
        this.conta = conta;
        this.valor = valor;
        data = new Date();
    }
    
    public Transacao(Date data, int valor, Conta conta){
        this.conta = conta;
        this.valor = valor;
        this.data = data;
    }
    
    public int getValor(){
        return valor;
    }
    
    public Date getData(){
        return data;
    }

    public Conta getConta() {
        return conta;
    }
    
}
