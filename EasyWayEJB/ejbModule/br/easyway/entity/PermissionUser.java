package br.easyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PermissionUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPermission;
	@Column(length=100,nullable=false)
	private String descPermission;
	
	public long getIdPermission() {
		return idPermission;
	}
	public void setIdPermission(long idPermission) {
		this.idPermission = idPermission;
	}
	public String getDescPermission() {
		return descPermission;
	}
	public void setDescPermission(String descPermission) {
		this.descPermission = descPermission;
	}
	
	
	
	

}
