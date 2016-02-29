/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import modelos.Conta;

/**
 *
 * @author Barbara
 */
public class SaqueDAO extends TransacaoDAO{
    
    private Connection conn;
    
    public SaqueDAO(){
        super();
    }
    
    @Override
    public void nova(Conta conta, int valor) throws SQLException  {
        String updateTableSQL = "INSERT into transacao(`data`, `tipo`, `valor`, `numconta`) VALUES(?, '?', ?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
        preparedStatement.setDate(1, Date.valueOf(LocalDate.now()));
        preparedStatement.setString(2, "S"); // s = saque;
        preparedStatement.setInt(3, valor);
        preparedStatement.setString(4, conta.getNumero());
        
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
    }
    
}
