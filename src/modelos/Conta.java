
package modelos;

import exceptions.SaldoInsuficienteException;
import java.util.ArrayList;
import basededados.dao.*;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class Conta {
   private int saldo;
   private String numero;
   private ArrayList<Transacao> transacoesMes;
   
   public Conta(String numConta, int saldo) {
       this.numero = numConta;
       this.saldo = saldo;
       transacoesMes = new TransacaoDAO().getExtratoInicial(this);
   }

    public int getSaldo() {
	return saldo;
    }
	
    private void setSaldo(int saldo) {
	this.saldo = saldo;
    }
    
    public void updateSaldo(int valor){
        setSaldo(saldo+valor);
    }
	
    public String getNumero() {
	return numero;
    }

    public String getSaldoString() {
        String saldoFinal = "R$ "+ (saldo/100) + "," + (saldo - ((saldo/100)*100));

        return saldoFinal;
    }
    
    public Saque saca(int valor) throws SaldoInsuficienteException{ //valor do saque positivo
        if((saldo - valor) >= 0){
            return new Saque(valor, this);
        }else{
            throw new SaldoInsuficienteException();
        }
    }
}
