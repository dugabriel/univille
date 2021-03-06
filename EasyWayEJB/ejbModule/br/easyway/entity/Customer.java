package br.easyway.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="allCustomer", query="Select c from Customer c"),
	@NamedQuery(name="cnpjCustomer", query="Select c from Customer c where c.CNPJ = :cnpj")
})



@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCustomer;
	@Column(length=200,nullable=false)
	private String nameCustomer;
	@Column(length=200)
	private String emailCustomer;
	@Column(nullable=false)
	private int CNPJ;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCustomer;
	@Column(length=255,nullable=false)
	private String addressCustomer;
	
	
	public String getAddressCustomer() {
		return addressCustomer;
	}
	public void setAddressCustomer(String addressCustomer) {
		this.addressCustomer = addressCustomer;
	}
	public long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getNameCustomer() {
		return nameCustomer;
	}
	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}
	public String getEmailCustomer() {
		return emailCustomer;
	}
	public void setEmailCustomer(String emailCustomer) {
		this.emailCustomer = emailCustomer;
	}
	public int getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	public Date getDateCustomer() {
		return dateCustomer;
	}
	public void setDateCustomer(Date dateCustomer) {
		this.dateCustomer = dateCustomer;
	}
	
}
