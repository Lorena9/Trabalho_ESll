/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import basededados.BancoDeDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import modelos.Conta;
import modelos.Transacao;

/**
 *
 * @author Barbara
 */
public class TransacaoDAO {

    private Connection conn;
    ResultSet resultado = null;

    public TransacaoDAO() {
        conn = BancoDeDados.getInstance();
    }

    public ArrayList<Transacao> getExtratoInicial(Conta conta) {
        ArrayList<Transacao> extrato = new ArrayList<Transacao>();

        try {
            String geraExtratoMes = "SELECT * FROM atm.transacao WHERE month(dt_transacao) = month(now()) AND year(dt_transacao)=year(now());";
            PreparedStatement preparedStatement = conn.prepareStatement(geraExtratoMes);
            resultado = preparedStatement.executeQuery();

            Transacao temp;

            Date dt_transacao;
            int valor;

            while (resultado.next()) {
                dt_transacao = resultado.getDate("dt_transacao");
                valor = resultado.getInt("valor");

                temp = new Transacao(dt_transacao, valor, conta);

                extrato.add(temp);
            }
        } catch (Exception e) {
        }

        return extrato;
    }

    public ArrayList<Transacao> getExtrato(Conta conta, Date dt_ini, Date dt_fim) throws SQLException {
        String geraExtrato = "SELECT * FROM transacao WHERE dt_transacao > ? AND dt_transacao < ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(geraExtrato);
        preparedStatement.setDate(1, (java.sql.Date) dt_ini);
        preparedStatement.setDate(2, (java.sql.Date) dt_fim);

        resultado = preparedStatement.executeQuery();

        ArrayList<Transacao> extrato = new ArrayList<Transacao>();

        Transacao temp;

        Date dt_transacao;
        int valor;

        while (resultado.next()) {

            dt_transacao = resultado.getDate("dt_transacao");
            valor = resultado.getInt("valor");

            temp = new Transacao(dt_transacao, valor, conta);

            extrato.add(temp);
        }

        return extrato;
    }

}
