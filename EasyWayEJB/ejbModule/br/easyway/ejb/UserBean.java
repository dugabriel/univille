package br.easyway.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.easyway.entity.Customer;
import br.easyway.entity.User;

@Stateless
@LocalBean
public class UserBean implements UserBeanLocal {

   
	@PersistenceContext(name="ewDScontext")
	private EntityManager em;
	
	public List<User> getAllUsers(){
		Query q = em.createNamedQuery("allUsers");
		return q.getResultList();
	}
	
	public void saveUser(User model){
		if(em.find(Customer.class, model.getIdUser()) == null){
			em.persist(model);
		}else{
			em.merge(model);
		}
	}
	
	public void deleteCustomer(User user){
		user  = em.find(User.class, user.getIdUser());
		if(user != null) em.remove(user);
	}

}
