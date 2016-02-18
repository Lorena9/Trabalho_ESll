/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import basededados.BancoDeDados;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelos.Conta;
import modelos.Usuario;

/**
 *
 * @author Lorena
 */
public class DepositoDAO {

    private Connection conn;

    public DepositoDAO() {
        conn = BancoDeDados.getInstance();
    }
    
        public void atualizaConta(String conta, int saldoNovo) throws SQLException  {
        String updateTableSQL = "UPDATE conta SET saldo = '"+saldoNovo+"' WHERE numconta = '"+conta+"'";
        PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);

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

}
