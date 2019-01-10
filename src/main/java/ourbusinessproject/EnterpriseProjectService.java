package ourbusinessproject;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
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
        Enterprise enterprise = entityManager.merge(project.getEnterprise());
        project.setEnterprise(enterprise);
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
        TypedQuery<Project> query = entityManager.createQuery("select p from Project p order by p.title", Project.class);
        return query.getResultList();
    }
}