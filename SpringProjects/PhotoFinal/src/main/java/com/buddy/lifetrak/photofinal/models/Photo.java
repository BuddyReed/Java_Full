package com.buddy.lifetrak.photofinal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "photos")
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // SET THE ID AS AN AUTO=INCREMENTING
    private Long id;
	
    @NotEmpty
    @Size(min=2, max=40)
    private String name;
    
    @Column(nullable = true, length = 64)
    private String photos;

    
   
    
    public Photo(Long id, @NotEmpty @Size(min = 2, max = 40) String name, String photos) {
		super();
		this.id = id;
		this.name = name;
		this.photos = photos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

    

 
    // other fields and getters, setters are not shown 
    
    
    
    
    
    
}

