package br.easyway.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idProject;
	@Column(length=255,nullable=false)
	private String descProject;
	@Column(length=50,nullable=false)
	private int hourProject;
	@Column(nullable=false)
	private Boolean active;
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private List<User> listUser = new ArrayList<User>();
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private List<Resource> listResource = new ArrayList<Resource>();
	@ManyToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	private List<Customer> listCustomer = new ArrayList<Customer>();
	
	public long getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public String getDescProject() {
		return descProject;
	}
	public void setDescProject(String descProject) {
		this.descProject = descProject;
	}
	public int getHourProject() {
		return hourProject;
	}
	public void setHourProject(int hourProject) {
		this.hourProject = hourProject;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public List<User> getListUser() {
		return listUser;
	}
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	public List<Resource> getListResource() {
		return listResource;
	}
	public void setListResource(List<Resource> listResource) {
		this.listResource = listResource;
	}
	public List<Customer> getListCustomer() {
		return listCustomer;
	}
	public void setListCustomer(List<Customer> listCustomer) {
		this.listCustomer = listCustomer;
	}

	
	
}
