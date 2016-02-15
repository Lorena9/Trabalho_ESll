/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados.dao;

import basededados.BancoDeDados;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import modelos.Conta;
import modelos.Usuario;

/**
 *
 * @author lorena
 */
public class UsuarioDAO {

    private Connection conn;

    public UsuarioDAO() {
        conn = BancoDeDados.getInstance();
    }

    public Usuario getUsuario(String numConta, String numAgencia) {
        Statement statement = null;
        ResultSet resultSet = null;
        Usuario usuario = null;
        String senhaBanco = null;
        String nomeBanco;
        String numContaBanco;
        String cpfBanco;
        String enderecoBanco;
        int saldoBanco;

        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(
                    "SELECT * FROM usuario u INNER JOIN conta c ON u.numconta = c.numconta"
                    + " WHERE u.numconta='" + numConta + "' and u.numagencia = '" + numAgencia + "';");

            // Lendo os dados do banco
            resultSet.next();
            senhaBanco = resultSet.getString("senha");
            numContaBanco = resultSet.getString("numconta");
            nomeBanco = resultSet.getString("nome");
            cpfBanco = resultSet.getString("cpf");
            enderecoBanco = resultSet.getString("endereco");
            saldoBanco = resultSet.getInt("saldo");

            // Criando objeto usuario com dados lidos do MySQL
            usuario = new Usuario(new Conta(numContaBanco, saldoBanco), senhaBanco, nomeBanco, cpfBanco, enderecoBanco);

            // System.out.println("nome: "+ nomeBanco);
        } catch (Exception e) {
            System.out.println("Erro ao buscar usuário: " + e);
        }

        return usuario;
    }

}
