/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelos.Agencia;
import modelos.Conta;
import modelos.Usuario;

/**
 *
 * @author Lorena
 */
public class BancoDeDadosEmMemoria {

    Agencia agencia;
//    List<Usuario> usuarios;
//    List<Conta> contas;

    public BancoDeDadosEmMemoria() {
//        usuarios = new ArrayList<>();
//        contas = new ArrayList<>();
        agencia = new Agencia();


    }

    public boolean autenticar(String numAgencia, String numConta, String senha) {
        
        Usuario u = agencia.getUsuario(numConta);

        if (u.getSenha().equalsIgnoreCase(senha))
            return true;

        return false;
    }

}
