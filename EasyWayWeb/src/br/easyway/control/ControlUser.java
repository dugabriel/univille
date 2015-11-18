package br.easyway.control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.easyway.ejb.UserBeanLocal;
import br.easyway.entity.User;

@ManagedBean(name="controlUser")
@ViewScoped
public class ControlUser {
	
	@EJB
	private UserBeanLocal userBean;
	
	private User model = new User();

	public UserBeanLocal getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBeanLocal userBean) {
		this.userBean = userBean;
	}

	public User getModel() {
		return model;
	}

	public void setModel(User model) {
		this.model = model;
	}
	
	public void createNewUser(){
		System.out.println("#Create new user");
		model = new User();
	}
	
	public void save(){
		userBean.saveUser(model);;
		createNewUser();
	}
	
	public List<User> getAllUsers(){
		return userBean.getAllUsers();
	}
	
	@PostConstruct
	public void init(){
		System.out.println("LOAD USER");
		createNewUser();
	}
	

}
