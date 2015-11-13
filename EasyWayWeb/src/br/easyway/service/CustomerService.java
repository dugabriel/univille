package br.easyway.service;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.easyway.ejb.CustomerBeanLocal;
import br.easyway.entity.Customer;

@Path("/customer")
@javax.enterprise.context.RequestScoped
public class CustomerService {
	
	@Inject
	private CustomerBeanLocal customerBean;
	
	@GET
	@Path("/all")
	@Produces("application/json")
	public List<Customer> getAllCustomer(){
		return customerBean.getAllCustomer();
	}
	
}
