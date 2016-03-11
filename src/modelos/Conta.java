
package modelos;

import basededados.ContaDAO;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos
 */
public class Conta {
   private int saldo;
   private final String numero;
   private Deposito novoDeposito;
   private ArrayList<Transacao> transacoes;
   ContaDAO contaDao;
   
   public Conta(String numConta, int saldo) {
       this.numero = numConta;
       this.saldo = saldo;
       contaDao = new ContaDAO();
       
   }
   
//   public void getExtratoMes() throws SQLException{
//       transacoesMes = new TransacaoDAO().getExtratoInicial(this);
//   }

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
    
/*
    public Saque saca(int valor) throws SaldoInsuficienteException{ //valor do saque positivo
        if((saldo - valor) >= 0){
            return new Saque(valor, this);
        }else{
            throw new SaldoInsuficienteException();
        }
    }
*/

    boolean deposita(String agencia, String conta, int valor) {
      
        novoDeposito = new Deposito (agencia, conta, new Date(), valor);
        if (novoDeposito.deposita (agencia, conta, new Date(), valor, this)) {
            saldo = saldo + valor;
            transacoes.add(novoDeposito);
            
            System.out.println("Deposito executado com sucesso!");
            System.out.println("Novo saldo: "+saldo);
            
            return true;
        }

        return false;
    }

    String getExtratoInicial(String agencia, String conta) {
        return contaDao.getExtratoInicial(agencia, conta);
        
    }
}
