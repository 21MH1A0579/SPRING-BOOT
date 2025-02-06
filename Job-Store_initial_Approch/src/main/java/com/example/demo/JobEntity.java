package com.example.demo;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "professionals")
public class JobEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "experience")
    private int experience;

    @Column(name = "profile", length = 50)
    private String profile;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tech> techs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public List<Tech> getTechs() {
		return techs;
	}

	public void setTechs(List<Tech> techs) {
		this.techs = techs;
	}

   
}

