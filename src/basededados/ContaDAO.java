/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados;

import basededados.BancoDeDados;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import modelos.Conta;
import modelos.Deposito;
import modelos.Saque;
import modelos.Transacao;
import modelos.Transferencia;

/**
 *
 * @author lorena
 */
public class ContaDAO {

    private Connection conn;
    ResultSet resultado = null;

    public ContaDAO() {
        conn = BancoDeDados.getInstance();
    }

    public String getExtratoInicial(String agencia, String conta) {
        String extratoTexto = "";
        
        try {
        String geraExtratoMes = "SELECT * FROM atm.transacao WHERE agencia = '"+agencia+"' AND conta = '"+conta+"';";
        PreparedStatement preparedStatement = conn.prepareStatement(geraExtratoMes);
        resultado = preparedStatement.executeQuery();
        
        ArrayList<Transacao> extrato = new ArrayList<Transacao>();
        
        Transacao temp = null;
        
        Date dt_transacao;
        int valor;
        String tipo;
        
        while(resultado.next()){
            dt_transacao  = resultado.getDate("data");
            valor = resultado.getInt("valor");
            tipo = resultado.getString("tipo");
            
            if (tipo.equals("s"))
                temp = new Saque(agencia, conta, dt_transacao, valor);

            if (tipo.equals("d"))
                temp = new Deposito(agencia, conta, dt_transacao, valor);
            
            if (tipo.equals("t"))
                temp = new Transferencia(agencia, conta, dt_transacao, valor);
           
            extrato.add(temp);
        }
        
        for(int i=0; i < extrato.size(); i++){
            extratoTexto = extratoTexto + extrato.get(i).toString() + "\n";
        }
        
        } catch (Exception e) { }
        
        return extratoTexto;
    }

    public ArrayList<Transacao> getExtrato(Conta conta, Date dt_ini, Date dt_fim) throws SQLException {
        String geraExtrato = "SELECT * FROM transacao WHERE `data` > ? AND `data` < ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(geraExtrato);
        preparedStatement.setDate(1, (java.sql.Date) dt_ini);
        preparedStatement.setDate(2, (java.sql.Date) dt_fim);

        resultado = preparedStatement.executeQuery();

        ArrayList<Transacao> extrato = new ArrayList<Transacao>();

        Transacao temp;

        Date dt_transacao;
        int valor;
        String tipo;

        while (resultado.next()) {

            dt_transacao = resultado.getDate("data");
            valor = resultado.getInt("valor");
            tipo = resultado.getString("tipo");
            
  
//            temp = new Transacao(dt_transacao, valor, conta);

//            extrato.add(temp);
        }

        return extrato;
    }
    
    public void novaTransacao(Conta conta, int valor) throws SQLException  {
        String updateTableSQL = "INSERT into transacao(`data`, `tipo`, `valor`, `numconta`) VALUES(?, '?', ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
        preparedStatement.setDate(1, Date.valueOf(LocalDate.now()));
        preparedStatement.setString(2, "S"); // s = saque;
        preparedStatement.setInt(3, valor);
        preparedStatement.setString(4, conta.getNumero());
        
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
    }

    public void atualizaConta(Conta conta) throws SQLException  {
        String updateTableSQL = "UPDATE conta SET saldo = ? WHERE numconta = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
        preparedStatement.setInt(1, conta.getSaldo());
        preparedStatement.setString(2, conta.getNumero());
// execute insert SQL stetement
        preparedStatement.executeUpdate();
    }
    
    public int getSaldo(String conta, int valorDeposito) {

        Statement statement = null;
        ResultSet resultSet = null;
        int valorContaBanco = 0;
        try {
        statement = conn.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM conta WHERE numconta='"+conta+"'");
            System.out.println("teste 1");

        resultSet.next();
        valorContaBanco = resultSet.getInt("saldo");
            System.out.println("teste 2");
} catch (Exception e) {
    
}    

        return valorContaBanco;
    }

    public boolean deposita(String agencia, String conta, java.util.Date data, int valor) {
        // Inserir na tabela transacoes
        // Update na tabela conta
        
        
        return false;
    }
   
}
