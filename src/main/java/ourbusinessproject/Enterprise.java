package ourbusinessproject;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Enterprise {
	@NotBlank
	private String name;
	@NotNull @Size(min=10)
	private String description;
	@Email @NotBlank
	private String email;

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
