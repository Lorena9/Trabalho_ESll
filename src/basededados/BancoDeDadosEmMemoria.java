/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededados;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelos.Conta;
import modelos.Usuario;

/**
 *
 * @author Lorena
 */
public class BancoDeDadosEmMemoria {

    List<Usuario> usuarios;
    List<Conta> contas;

    public BancoDeDadosEmMemoria() {
        usuarios = new ArrayList<>();
        contas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Usuario u = new Usuario("Usuario" + i, "123456", "Usuario" + i, "12345678", LocalDate.now());
            contas.add(new Conta("" + i, "123", u, Math.random()*(Math.random()*100)));
        }
    }

    public boolean autenticar(String numeroConta, String senha) {
        for (Conta c : contas) {
            if (c.getNumero().equalsIgnoreCase(numeroConta)) {
                Usuario u = c.getUsuario();
                if (u.getSenha().equalsIgnoreCase(senha)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Conta recuperarConta(String numero) throws Exception {
        for (Conta c : contas) {
            if (c.getNumero().equalsIgnoreCase(numero)) {
                return c;
            }
        }
        throw new Exception("Conta não encontrada");
    }

}
