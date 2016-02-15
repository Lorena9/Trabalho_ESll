package basededados;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author carlosoliv
 */
public class BancoDeDados {

    private static final String URL = "jdbc:mysql://localhost:3306/atm";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "tzzk7662";
    private static Connection conn = null;

    private BancoDeDados() {
    }

    public static Connection getInstance() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Conexão com o banco estabelecida!");
            } catch (Exception e) {
                System.err.println("Erro ao conectar com o banco: " + e);
            }
        }
        return conn;
    }
}
