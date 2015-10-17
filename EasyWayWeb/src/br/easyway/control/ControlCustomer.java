package br.easyway.control;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.easyway.ejb.CustomerBeanLocal;
import br.easyway.entity.Customer;


@ManagedBean(name="controlCustomer")
@ViewScoped
public class ControlCustomer {
	@EJB
	private CustomerBeanLocal customerBean;
	
	private Customer model = new Customer();

	
	public CustomerBeanLocal getCustomerBean() {
		return customerBean;
	}

	public void setCustomerBean(CustomerBeanLocal customerBean) {
		this.customerBean = customerBean;
	}
		
	public void createNewCustomer(){
		model = new Customer();
	}
	
	public void save(){
		System.out.println("#Novo cliente...");		
		customerBean.save(model);
	}
	
	public Customer getModel(){
		return model;
	}
	
	public void setModel(Customer model) {
		this.model = model;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("#LOAD PAGE CUSTOMER");
		createNewCustomer();
	}
	
}