/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_es;

/**
 *
 * @author T
 */
public class Conta {
   private double saldo;
   private String numero;
   private String agencia;
   private Usuario usuario;
   
   public Conta(String numero, String agencia, Usuario usuario){
	   this.numero = numero;
	   this.agencia = agencia;
	   this.usuario = usuario;
	   saldo = 0.0;
   }

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	   
	   
}
