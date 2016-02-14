
package basededados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import modelos.Usuario;
import modelos.Conta;

/**
 *
 * @author carlosoliv
 */
public class BancoDeDados {
    private Connection conn = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet = null;

    public BancoDeDados() {

    }

    public void conecta() {
        String url = "jdbc:mysql://localhost:3306/atm";
        String username = "root";
        //String password = "123456";
        String password = "uff1116";

        System.out.println("Conectando no banco...");
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.conn = DriverManager.getConnection(url, username, password);
            
            System.out.println("Conectado no banco!");
        } catch (Exception e) {
            System.out.println("erro: "+e);
        }
    }

    public Usuario buscaUsuario(String numConta, String numAgencia) {
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
                    + " WHERE u.numconta='"+numConta+"' and u.numagencia = '"+numAgencia+"';");
            
            // Lendo os dados do banco
            resultSet.next();
            senhaBanco = resultSet.getString("senha");
            numContaBanco = resultSet.getString("numconta");
            nomeBanco = resultSet.getString("nome");
            cpfBanco = resultSet.getString("cpf");
            enderecoBanco = resultSet.getString("endereco");
            saldoBanco = resultSet.getInt("saldo");

            // Criando objeto usuario com dados lidos do MySQL
            usuario = new Usuario (new Conta(numContaBanco, saldoBanco), senhaBanco, nomeBanco, cpfBanco, enderecoBanco);

            // System.out.println("nome: "+ nomeBanco);
            
        } catch (Exception e) {
            System.out.println("Erro: "+e);
        }

        return usuario;
    }
}
