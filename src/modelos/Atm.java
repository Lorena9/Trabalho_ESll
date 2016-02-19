package modelos;

import basededados.dao.UsuarioDAO;

/**
 *
 * @author Carlos
 */
public class Atm {
    private final Agencia agencia;
    private final UsuarioDAO userDAO;
    private final Deposito deposito;
    
    public Atm(){
        agencia = new Agencia();
        userDAO = new UsuarioDAO();
        deposito = new Deposito();
    }
    
    public boolean executaDeposito(String agencia, String conta, int valor) {
        return deposito.deposita(agencia, conta, valor);
        
    }
    
    public Usuario autenticar(String numAgencia, String numConta, String senha) {
        Usuario usuarioLogado;
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
