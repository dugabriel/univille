package br.easyway.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.easyway.entity.Resource;

@Stateless
@LocalBean
public class ResourceBean implements ResourceBeanLocal {
	
	@PersistenceContext(name="ewDScontext")
	private EntityManager em;

	public List<Resource> getAllResources(){
		Query q = em.createNamedQuery("allResources");
		return q.getResultList();
	}
	
	public void saveResource(Resource model){
		if(em.find(Resource.class, model.getIdResource()) == null){
			em.persist(model);
		}else{
			em.merge(model);
		}
	}
	
	public void deleteResource(Resource resource){
		resource  = em.find(Resource.class, resource.getIdResource());
		if(resource != null) em.remove(resource);
	}
	
    public ResourceBean() {
       
    }

}
