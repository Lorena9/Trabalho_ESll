/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Agencia {
    public String numAgencia = "29076";
    public List<Usuario> usuarios;
    
    public Agencia () {
        usuarios = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            usuarios.add(new Usuario(new Conta(""+i, 0), "123456", "Usuario" + i, "05892956492", "Rua Passos n. 123"));
            
        }
    }

    public Usuario getUsuario (String conta) {
        for (Usuario u : usuarios) {
            if (u.getConta().getNumero().equalsIgnoreCase(conta))
                return u;
        }
        return null;
    }
}
