package controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ContatoController implements Serializable {

	private static final long serialVersionUID = 513876511187015913L;
	
	private String nome;
	private String email;
	private String mensagem;
	
	//imprime no console os dados inseridos
	public void entrar () {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Mensagem: " + mensagem);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
	
	

}
