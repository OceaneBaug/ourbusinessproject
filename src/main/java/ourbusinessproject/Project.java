package ourbusinessproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "projets")
public class Project {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NotNull @Size(min=2)
	// @NotBlank = combine les 2
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	

	@Column(name = "enterprise")
	@NotNull
	@ManyToOne
	private Enterprise enterprise;
	
	public Long getId() {return this.id ; }
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
		
	}
	
	

}
