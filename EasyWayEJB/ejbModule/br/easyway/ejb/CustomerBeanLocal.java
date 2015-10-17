package br.easyway.ejb;

import java.util.List;

import javax.ejb.Local;

import br.easyway.entity.Customer;

@Local
public interface CustomerBeanLocal {
	
	public List<Customer> getAllCustomer();
	
	public List<Customer> getCustomerCNPJ(int cnpj);
	
	public void saveCustomer(Customer customer);
	
	public void deleteCustomer(Customer customer);

	public void save(Customer model);

}
