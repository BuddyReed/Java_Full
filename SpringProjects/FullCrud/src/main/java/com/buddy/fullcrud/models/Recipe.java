package com.buddy.fullcrud.models;

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
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


// THIS IS THE MANY SET UP FO THE MODEL


@Entity
@Table(name = "recipes")
public class Recipe {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty
	private String name;
	@NotEmpty
	private String description;
	@NotNull
	private boolean under30Min;
	
	// RELATIONSHIP 
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User creator;
	
	
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
    
    // CONSTRUCTOR
    public Recipe() {}
    
	public Recipe(@NotEmpty String name, @NotEmpty String description, @NotNull boolean under30Min) {
		this.name = name;
		this.description = description;
		this.under30Min = under30Min;
	}


	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    // GETTERS AND SETTERS
    
}
