package br.easyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name="allResources", query="Select r from Resource r")
})


@Entity
public class Resource {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idResource;
	@Column(length=255,nullable=false)
	private String descResource;
	
	public long getIdResource() {
		return idResource;
	}
	
	public void setIdResource(int idResource) {
		this.idResource = idResource;
	}
	
	public String getDescResource() {
		return descResource;
	}
	
	public void setDescResource(String descResource) {
		this.descResource = descResource;
	}
}
