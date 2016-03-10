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
    private String agencia;
    private String conta;
    Date data;
    private int valor; //obs: valor em centavos de real! Considerar duas casas decimais!
       
    public Transacao(String agencia, String conta, Date data, int valor) {
        this.agencia = agencia;
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

    public String getConta() {
        return conta;
    }
    
    @Override
    public String toString(){
        return data.toString()+ "  "+valor;
    }
    
}
