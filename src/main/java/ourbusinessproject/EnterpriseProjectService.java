package ourbusinessproject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

@Service // pour déclencher Autowired
public class EnterpriseProjectService {
	
	@PersistenceContext
	private EntityManager entityManager;

	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
		
	}

	public void save(Project project) {
		entityManager.persist(project);		
	}

	public void save(Enterprise enterprise) {
		entityManager.persist(enterprise);
		
	}

	public Project findProjectById(Long anId) {
		return entityManager.find(Project.class, anId);		
	}

	public Enterprise findEnterpriseById(Long anId) {
		return entityManager.find(Enterprise.class, anId);			
	}






}
