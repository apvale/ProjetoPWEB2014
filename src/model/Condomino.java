package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="condominos")
public class Condomino implements Serializable{

private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome_proprietario, apto, telefone, email, moradores_unidades, login, senha;
	
	
	public Condomino(){}
	
	
	public Condomino(String nome_proprietario, String apto, String telefone,
			String email, String moradores_unidades, String login, String senha) {
		this.nome_proprietario = nome_proprietario;
		this.apto = apto;
		this.telefone = telefone;
		this.email = email;
		this.moradores_unidades = moradores_unidades;
		this.login = login;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getNome_proprietario() {
		return nome_proprietario;
	}


	public void setNome_proprietario(String nome_proprietario) {
		this.nome_proprietario = nome_proprietario;
	}


	public String getApto() {
		return apto;
	}


	public void setApto(String apto) {
		this.apto = apto;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMoradores_unidades() {
		return moradores_unidades;
	}


	public void setMoradores_unidades(String moradores_unidades) {
		this.moradores_unidades = moradores_unidades;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
}
