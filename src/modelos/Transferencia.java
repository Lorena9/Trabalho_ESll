/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Date;

public class Transferencia extends Transacao {
    private String contaOrigem;
    private String contaDestino;
    
    public Transferencia(String agencia, String conta, Date data, int valor){
        super(agencia, conta, data, valor);
    }
}
