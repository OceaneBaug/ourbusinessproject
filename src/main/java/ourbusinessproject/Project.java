package ourbusinessproject;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Project {
	@NotNull @Size(min=2)
	private String title;
	private String description;
	
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
	
	

}
