
package modelos;

import java.util.Date;

public class Saque extends Transacao {

    public Saque(String agencia, String conta, Date data, int valor) {
        super(agencia, conta, data, (-1) * valor); // valor vira negativo pois é uma retirada de dinheiro
    }
    
/*
    public Conta sacar() throws SaldoInsuficienteException {
        if ((getValor() + getConta().getSaldo()) >= 0) {
            getConta().updateSaldo(getValor());
        } else {
            throw new SaldoInsuficienteException();
        }
        return getConta();
    }
    */
    
    @Override
    public String toString(){
        return "SAQUE          "+getData().toString()+ "  "+getValor();
    }

    public Conta sacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
