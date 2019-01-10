package ourbusinessproject;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull @Size(min=2)
    private String title;

    private String description;

    @NotNull @ManyToOne
    private Enterprise enterprise;

    public Project() {}

    public Project(@NotNull @Size(min = 2) String title, String description, @NotNull Enterprise enterprise) {
        this.title = title;
        this.description = description;
        this.enterprise = enterprise;
    }

    public Long getId() {
        return id;
    }

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

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        if (enterprise != null) {
            enterprise.addProject(this);
        }
    }
}