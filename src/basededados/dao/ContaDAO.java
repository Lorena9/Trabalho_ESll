/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import basededados.BancoDeDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Conta;

/**
 *
 * @author lorena
 */
public class ContaDAO {

    private Connection conn;

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
}
