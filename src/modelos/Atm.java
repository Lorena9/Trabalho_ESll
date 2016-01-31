package modelos;

import basededados.BancoDeDados;

/**
 *
 * @author Carlos
 */
public class Atm {
    private Agencia agencia;
    private BancoDeDados banco;
    

    public Atm() {
        agencia = new Agencia();
        banco = new BancoDeDados();
    }
    
    public Usuario autenticar(String numAgencia, String numConta, String senha) {
        Usuario usuarioLogado = null;
        String senhaBanco = null;
        
        banco.conecta ();
        usuarioLogado = banco.buscaUsuario (numConta, numAgencia);
        
        if (usuarioLogado != null)
            senhaBanco = usuarioLogado.getSenha();
        
        if (senhaBanco.equalsIgnoreCase(senha))
            return usuarioLogado;

        return null;
    }
    
    public Agencia getAgencia () {
        return agencia;
    }
    
}
