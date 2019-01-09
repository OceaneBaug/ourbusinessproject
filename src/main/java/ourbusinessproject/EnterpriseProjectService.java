package ourbusinessproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

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
		// sauvegarde l'entreprise du projet
		save(project.getEnterprise());
		// sauvegarde le projet
		entityManager.persist(project);		
		entityManager.flush();
	}

	public void save(Enterprise enterprise) {
		entityManager.persist(enterprise);
		entityManager.flush();
		
	}

	public Project findProjectById(Long anId) {
		return entityManager.find(Project.class, anId);		
	}

	public Enterprise findEnterpriseById(Long anId) {
		return entityManager.find(Enterprise.class, anId);			
	}

	public List<Project> findAllProjects() {
		String rqt = "SELECT p FROM Project p ORDER BY p.title";
		TypedQuery<Project> queryObj = entityManager.createQuery(rqt,Project.class);
		return queryObj.getResultList();
	}






}
