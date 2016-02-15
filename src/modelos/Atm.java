package modelos;

import basededados.dao.UsuarioDAO;

/**
 *
 * @author Carlos
 */
public class Atm {
    private Agencia agencia;
    private UsuarioDAO userDAO;
    
    public Atm() {
        agencia = new Agencia();
        userDAO = new UsuarioDAO();
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
