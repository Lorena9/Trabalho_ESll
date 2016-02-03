
package modelos;

/**
 *
 * @author T
 */
public class Conta {
   private int saldo;
   private String numConta;
   
   public Conta(String numConta, int saldo){
       this.numConta = numConta;
       this.saldo = saldo;
   }

    public int getSaldo() {
	return saldo;
    }
	
    public void setSaldo(int saldo) {
	this.saldo = saldo;
    }
	
    public String getNumero() {
	return numConta;
    }

    public String getSaldoString() {
        String saldoFinal = "R$ "+ (saldo/100) + "," + (saldo - ((saldo/100)*100));

        return saldoFinal;
    }
}
