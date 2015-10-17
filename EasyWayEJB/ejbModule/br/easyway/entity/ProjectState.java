package br.easyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProjectState {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idProjectState;
	@Column(nullable=false,length=250)
	private String descProjectState;
	
	public long getIdProjectState() {
		return idProjectState;
	}
	public void setIdProjectState(int idProjectState) {
		this.idProjectState = idProjectState;
	}
	public String getDescProjectState() {
		return descProjectState;
	}
	public void setDescProjectState(String descProjectState) {
		this.descProjectState = descProjectState;
	}
	
	
}
