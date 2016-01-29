package modelos;

/**
 *
 * @author Carlos
 */
public class Atm {
    private Agencia agencia;

    public Atm() {
        agencia = new Agencia();
    }

    public boolean autenticar(String numAgencia, String numConta, String senha) {

        Usuario u = agencia.getUsuario(numConta);

        if (u.getSenha().equalsIgnoreCase(senha))
            return true;

        return false;
    }
    
    public Agencia getAgencia () {
        return agencia;
    }
    
}
