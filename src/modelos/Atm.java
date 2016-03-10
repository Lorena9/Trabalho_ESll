package modelos;

import basededados.UsuarioDAO;

/**
 *
 * @author Carlos
 */
public class Atm {
    private final Agencia agencia;
    private Usuario usuarioLogado;
    private final UsuarioDAO userDAO;
    
    public Atm(){
        agencia = new Agencia();
        userDAO = new UsuarioDAO();
    }
    
    public boolean executaDeposito(String agencia, String conta, int valor) {
        return usuarioLogado.getConta().deposita(agencia, conta, valor);
    }
    
    public Usuario autenticar(String numAgencia, String numConta, String senha) {
        String senhaBanco;

        usuarioLogado = userDAO.getUsuario (numConta, numAgencia);
        
        if (usuarioLogado != null) {
            senhaBanco = usuarioLogado.getSenha();

            if (senhaBanco.equalsIgnoreCase(senha))
                return usuarioLogado;
        }
        return null;
    }
    
    public Agencia getAgencia () {
        return agencia;
    }
    
}
