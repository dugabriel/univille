package br.easyway.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class UserBean
 */
@Stateless
@LocalBean
public class UserBean implements UserBeanLocal {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext(name="ewDScontext")
	private EntityManager em;
	
    public UserBean() {
        // TODO Auto-generated constructor stub
    }
    
    

}
