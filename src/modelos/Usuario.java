
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
	   this.telefone = null;
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
