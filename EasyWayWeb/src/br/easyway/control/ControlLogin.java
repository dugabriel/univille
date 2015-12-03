package br.easyway.control;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;



import com.sun.istack.internal.logging.Logger;

import br.easyway.ejb.UserBeanLocal;
import br.easyway.entity.User;

@ManagedBean(name="controlLogin")
@ViewScoped
public class ControlLogin {
	
	private static final Logger log = Logger.getLogger(ControlLogin.class);
	
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
		System.out.println("#Validando admin");
		this.model = model;
	}
	
	
	public void validateLogin(){
		User user = null;
	
		
		log.info("#validate user result: " + userBean.validateUser(model.getLogin(), model.getPassword()));
		
		user = userBean.validateUser(model.getLogin(), model.getPassword());
		
		if(user != null){
			FacesContext fc = FacesContext.getCurrentInstance();
			ExternalContext ec = fc.getExternalContext();
			HttpSession session = (HttpSession) fc.getExternalContext().getSession(true);
			session.setAttribute("AUTHENTICATE", user);
			
			log.info("#session: " + session.getAttribute("AUTHENTICATE"));
			
			try {
				ec.redirect("home.xhtml");
			} catch (Exception e) {
				log.info("#-->ERRO AO LOGAR: " + e.toString());
			}
			
		}else{
			log.info("#ERRO AO LOGAR");
			RequestContext.getCurrentInstance().execute("showAlertMessage('Usuário ou senha inválida')");	
		}
	}
	
	
	@PostConstruct
	public void validateAdminUser(){
		log.info("#validateUser 10");
		userBean.createAdmin();
	}

}
