package br.easyway.ejb;

import java.util.List;

import javax.ejb.Local;

import br.easyway.entity.User;

@Local
public interface UserBeanLocal {
	
	 public List<User> getAllUsers();
	 
	 public void saveUser(User model);
	 
	 public void deleteCustomer(User user);

}
