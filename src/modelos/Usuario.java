/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.time.LocalDate;

/**
 *
 * @author T
 */
public class Usuario {

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(LocalDate dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }
   private String login;
   private String senha;
   private String nome;
   private String endereco;
   private String telefone;
   private String cpf;
   private LocalDate dt_nascimento;
   
   public Usuario(String login, String senha, String nome, String cpf, LocalDate dt_nascimento){
	   
	   this.login = login;
	   this.senha = senha;
	   this.nome = nome;
	   this.cpf = cpf;
	   this.dt_nascimento = dt_nascimento;
	   endereco = null;
	   telefone = null;
	   
   }
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
   
   
}
