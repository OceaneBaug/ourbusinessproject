package ourbusinessproject;


public class InitializationService {
	
	private Enterprise enterprise1, enterprise2;
	
	private Project project1E1, project1E2, project2E1 ;

	public void initProjects() {
		enterprise1 = new Enterprise();
		enterprise1.setName("Enterprise 1");
		
		enterprise2 = new Enterprise();
		enterprise2.setName("Enterprise 2");
		
		project1E1 = new Project("Project 1", "Premier projet de l'entreprise 1", enterprise1);
		project1E2 = new Project("Project 1", "Premier projet de l'entreprise 2", enterprise2);
		project2E1 = new Project("Project 2", "Second projet de l'entreprise 1", enterprise1);
		
	}

	
	// TODO finir getter et setter
	public Project getProject1E1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Project getProject1E2() {
		// TODO Auto-generated method stub
		return null;
	}

	public Project getProject2E1() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enterprise getEnterprise1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Enterprise getEnterprise2() {
		// TODO Auto-generated method stub
		return null;
	}


}
