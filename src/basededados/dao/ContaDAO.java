/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import basededados.BancoDeDados;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Conta;
import modelos.Transacao;

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

    public void atualizaConta(Conta conta) throws SQLException  {
        String updateTableSQL = "UPDATE conta SET saldo = ? WHERE numconta = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
        preparedStatement.setInt(1, conta.getSaldo());
        preparedStatement.setString(2, conta.getNumero());
// execute insert SQL stetement
        preparedStatement.executeUpdate();
    }
    
    public String getExtratoInicial(Conta conta) throws SQLException  {
        String geraExtratoMes = "SELECT * FROM atm.transacao WHERE month(`data`) = month(now()) AND year(`data`)=year(now());";
        PreparedStatement preparedStatement = conn.prepareStatement(geraExtratoMes);
        resultado = preparedStatement.executeQuery();
        
        ArrayList<Transacao> extrato = new ArrayList<Transacao>();
        
        Transacao temp;
        
        Date dt_transacao;
        int valor;
        
        while(resultado.next()){
            dt_transacao  = resultado.getDate("data");
            valor = resultado.getInt("valor");
            
            temp = new Transacao(dt_transacao, valor, conta);
            
            extrato.add(temp);
        }
        
        String extratoTexto = "";
        
        for(int i=0; i < extrato.size(); i++){
            extratoTexto = extratoTexto + extrato.get(i).toString() + "\n";
        }
        
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

        while (resultado.next()) {

            dt_transacao = resultado.getDate("data");
            valor = resultado.getInt("valor");

            temp = new Transacao(dt_transacao, valor, conta);

            extrato.add(temp);
        }

        return extrato;
    }
}
