package ourbusinessproject;


import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Enterprise {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "name")
	@NotBlank
	private String name;
	
	@Column(name = "contact_name")
	@NotBlank
	private String contactName;
	
	@Column(name = "description")
	@Size(min=10)
	private String description;
	
	@Column(name = "email")
	@Email @NotBlank
	private String email;
	
	@Column(name = "projetcs")
	@OneToMany(mappedBy="entreprise")
	private Collection<Project> lesProjets;
	
	
	
	public Long getId() {return this.id ; }
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contact_name) {
		this.contactName = contact_name;
		
	}

	public String getDescription() {
		return this.description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
		
	}

	public String getContactEmail() {
		return this.email;
	}
	
	public void setContactEmail(String mail) {
		this.email = mail;
		
	}

	public Collection<Project> getProjects() {

		return this.lesProjets;
	}	

	

	




}
