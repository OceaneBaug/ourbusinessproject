package ourbusinessproject;


public class Bootstrap {
	
	private InitializationService initializationService;

	public Bootstrap(InitializationService initializationService) {
		this.initializationService = initializationService;
	}

	public void init() {
		// essai d'initialiser les projets
		try {
			initializationService.initProjects();
		// sinon retourne un message d'erreur
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

	public InitializationService getInitializationService() {
		return this.initializationService;
	}

}
