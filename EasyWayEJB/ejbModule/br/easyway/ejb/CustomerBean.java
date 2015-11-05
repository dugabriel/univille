package br.easyway.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.easyway.entity.Customer;

@Stateless
@LocalBean
public class CustomerBean implements CustomerBeanLocal {

	@PersistenceContext(name="ewDScontext")
	private EntityManager em;
	
	public List<Customer> getAllCustomer(){
		Query q = em.createNamedQuery("allCustomer");
		return q.getResultList();
	}

	public List<Customer> getCustomerCNPJ(int cnpj){
		Query q = em.createNamedQuery("cnpjCustomer");
		q.setParameter("cnpj",cnpj);
		return q.getResultList();
	}
	
	public void saveCustomer(Customer customer){

	}
	
	public void deleteCustomer(Customer customer){
		customer = em.find(Customer.class, customer.getIdCustomer());
		if(customer != null) em.remove(customer);
	}
	
    public CustomerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void save(Customer model) {
		if(em.find(Customer.class, model.getIdCustomer()) == null){
			em.persist(model);
		}else{
			em.merge(model);
		}
	}
}
