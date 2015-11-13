package br.easyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name="allUsers", query="Select u from SystemUser u")
})


@Entity(name="SystemUser")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUser;
	@Column(length=50,nullable=false,unique=true)
	private int CPF;
	@Column(nullable=false)
	private String login;
	@Column(nullable=false)
	private String password;
	@Column(length=200,nullable=false)
	private String nameUser;
	@Column(length=150)
	private String email;
	
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
