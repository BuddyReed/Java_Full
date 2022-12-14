package com.buddy.beltexam.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "babys")
public class Baby {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty
	@Size(min=3, max=40)
	private String name;
	
	@NotEmpty
	private String gender;
	
	@NotEmpty
	@Size(min=3, max=40)
	private String orgin;
	
	@NotEmpty
	@Size(min = 5, max = 200)
	private String description;
	
	
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
    
   
    // RELATIONSHIP
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User creator;    
    
    
    
    // CONSTRUCTORS
    
    public Baby() {}
    
    public Baby(@NotEmpty @Size(min = 3, max = 40) String name, @NotEmpty String gender,
			@NotEmpty @Size(min = 3, max = 40) String orgin, @NotEmpty @Size(min = 5, max = 200) String description) {
		super();
		this.name = name;
		this.gender = gender;
		this.orgin = orgin;
		this.description = description;
	}
    

	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }

	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
        
    }
	
    // GETTERS AND SETTERES

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}
	
    


	
	
	
}
