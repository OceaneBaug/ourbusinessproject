package ourbusinessproject;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	
	private EnterpriseProjectService enterpriseProjectService;

	public ProjectController(EnterpriseProjectService enterpriseProjectService) {
		this.enterpriseProjectService = enterpriseProjectService;
	}

	@RequestMapping(path="/projectsWithEnterprises")
	public List<Project> findAllProjectsWithEnterprises() {
		return this.enterpriseProjectService.findAllProjects();		
	}

}
