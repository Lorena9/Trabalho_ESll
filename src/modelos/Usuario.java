/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

public class Usuario {
    private Conta conta;
    
   private String senha;
   private String nome;
   private String endereco;
   private String telefone;
   private String cpf;

   public Usuario(Conta conta, String senha, String nome, String cpf, String endereco){
	   this.conta = conta;
	   this.senha = senha;
	   this.nome = nome;
	   this.cpf = cpf;
	   this.endereco = endereco;
	   telefone = null;
	   
   }
   
   public Conta getConta() {
       return conta;
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
