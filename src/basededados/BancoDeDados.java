
package basededados;

import modelos.Agencia;
import modelos.Usuario;

/**
 *
 * @author carlosoliv
 */
public class BancoDeDados {

    Agencia agencia;

    public BancoDeDados() {

        agencia = new Agencia();
        
        // Aqui podemos fazer um INSERT no banco pra inicializar as tabelas


    }

    public boolean autenticar(String numAgencia, String numConta, String senha) {
        
        Usuario u = agencia.getUsuario(numConta);

        if (u.getSenha().equalsIgnoreCase(senha))
            return true;

        return false;
    }

}
