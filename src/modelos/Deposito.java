
package modelos;

//import basededados.ContaDAO;
import java.util.Date;

public class Deposito extends Transacao {
    //private String tipoConta;
   // private String tipoDeposito;
      
    public Deposito(String agencia, String conta, Date data, int valor){
        super(agencia, conta, data, valor);
    }

    boolean deposita(String agencia, String conta, Date date, int valor, Conta contaAtual) {
        return contaAtual.contaDao.deposita(agencia, conta, data, valor);

    }
      
}
