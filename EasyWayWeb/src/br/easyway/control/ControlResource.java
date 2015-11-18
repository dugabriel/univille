package br.easyway.control;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.easyway.ejb.ResourceBeanLocal;
import br.easyway.entity.Resource;

@ManagedBean(name="controlResource")
@ViewScoped
public class ControlResource {
	
	@EJB
	private ResourceBeanLocal resourceBean;
	
	private Resource model = new Resource();

	public ResourceBeanLocal getResourceBean() {
		return resourceBean;
	}

	public void setResourceBean(ResourceBeanLocal resourceBean) {
		this.resourceBean = resourceBean;
	}

	public Resource getModel() {
		return model;
	}

	public void setModel(Resource model) {
		this.model = model;
	}

	
	public void createNewResource(){
		System.out.println("#Create new resource");
		model = new Resource();
	}
	
	public void save(){
		resourceBean.saveResource(model);
		createNewResource();
	}
	
	public List<Resource> getAllResource(){
		return resourceBean.getAllResources();
	}
	
	
	@PostConstruct
	public void init(){
		System.out.println("LOAD USER");
		createNewResource();
	}
}
