package ourbusinessproject;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Enterprise {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "name")
	@NotBlank
	private String name;
	
	@Column(name = "description")
	@NotNull @Size(min=10)
	private String description;
	
	@Column(name = "email")
	@Email @NotBlank
	private String email;
	
	public Long getId() {return this.id ; }

	public void setName(String nom) {
		this.name = nom;
		
	}

	public void setDescription(String desc) {
		this.description = desc;
		
	}

	public void setContactEmail(String mail) {
		this.email = mail;
		
	}



}
