package br.easyway.control;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import br.easyway.ejb.UserBeanLocal;
import br.easyway.entity.User;

@ManagedBean(name="controlLogin")
@ViewScoped
public class ControlLogin {
	
	@EJB
	private UserBeanLocal userBean;
	
	private User model;

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
		System.out.println("#Validando admin");
		this.model = model;
	}
	
	
	public String validateLogin(){
		User user = null;
		
		user = userBean.validateUser(model.getLogin(), model.getPassword());
		
		if(user != null){
			RequestContext.getCurrentInstance().execute("PF('dlgLogin').hide()");	
			FacesContext fc = FacesContext.getCurrentInstance();
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			session.setAttribute("AUTHENTICATE", user);
		}
		return "pages/welcome.xhtml?faces-redirect=true";
	}
	
	
	@PostConstruct
	public void validateAdminUser(){
		System.out.println("#validateUser");
		userBean.createAdmin();
	}

}
