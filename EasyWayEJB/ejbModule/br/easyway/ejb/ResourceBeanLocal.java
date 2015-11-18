package br.easyway.ejb;

import java.util.List;

import javax.ejb.Local;

import br.easyway.entity.Resource;

@Local
public interface ResourceBeanLocal {
	
	public List<Resource> getAllResources();
	
	public void deleteResource(Resource resource);
	
	public void saveResource(Resource model);

}
