package com.buddy.fullcrud.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.buddy.dojoninja.models.Dojo;


@Entity // REPRESENTS AN ENTITY MODEL FOR OUR APPLICATION
@Table(name = "fullcruds") //THE TABLE NAME IS THE CLASS NAME, AS PLURAL
public class FullCrud {
	


// MEMBER VARIABLES_________THEY VARY DEPENDING ON PROJECT_________MEMBER VARIABLES
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // SET THE ID AS AN AUTO=INCREMENTING
	    private Long id;
	    
	    @NotEmpty
	    @Size(min=3, max=40) // SIZE ADDS VALICATION THAT THE COLUMN MUST BE IN THE SPECTIFIED RANGE
	    private String firstName; 
	    
	    @NotEmpty
	    @Size(min=2, max=40)
	    private String lastName;
	    
	    @NotNull 
	    @Min(1) // ADD VLAIDATION THAT THE COLUMN MUST BE AT LEAST THE SPECIFIE\D VALUE
	    private int age;
	    
	    @NotNull
	    @Size(min = 5, max = 200)
	    private String description; 
	    
	    @NotNull(message="Must not be blank")
	    private Double amount;
	    
	    @Past
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date dob;
	    
	    @NotNull // ThIS ALLOWS YOU TO HAVE A CHOICE ON YOU JSP FOR YES OR NO
	    private boolean under30Min;
	    
	    @Column(updatable=false) // THE @COLUMN FALSE WILL NOT LET THE CREATEAT TO BE UPDATED
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
// MEMBER VARIABLES____________________________MEMBER VARIABLES	    
	
	    
	   
// RELATIONSHIP________________________________RELATIONSHIP
	    
	    // THIS GOES ON THE ONE SIDE OF THE ONE TO MANY
	    @OneToMany(mappedBy="creator", fetch = FetchType.LAZY)
	    private List<Dish> dishes; // THIS IS POINTING TO THE MODEL THAT 
	    // WILL HAVE THE MANY RELATIONSHIP (CONSIDERED A MEMBER VARIABLE) 
	    // THE LIST ALLOWS US TO KEEP TRACK OF MULTIPLE (MANY) ITEM IN A LIST.
	    
	    // THIS GOES ON THE MANY SIDE OF THE ONE TO MANY
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="dojo_id") // THIS IS THE FOREIGN KEY ON THE MANY TABLE(NEED TO BE SINGULAR
	    // THIS ALSO REPRESENTS THE ONE FROM THE ONE TO MANY RELATIONSHIP. 
	    private Dojo creator; // THE MEMBER VARIABLE (CREATOR) NEEDS TO MATCH THE MAPPEDBY..
	    
// RELATIONSHIP________________________________RELATIONSHIP	    
	  
	    
	    
	    
// CONSTRUCTORS________________________________CONSTRUCTORS
	    // THE EMPTY CONSTURCTOR IS NEED ESPECIALLY FOR DATABINDING
	    public Chef() {}
		
	    
	    // FOR THE FULL CONSTRUCTOR YOU WILL NOT INCLUDE THE ID, 
		// CREATEDAT AND UPDPATED AT. THAT WILL BE HANDLED BY THE DATABASE...
	    public Chef(@NotEmpty String fullName, Date dob) {
			super();
			this.fullName = fullName;
			this.dob = dob;
		}
		
// CONSTRUCTORS________________________________CONSTRUCTORS
		
		
// GETTERS / SETTERS / OTHER METHODS
		@PrePersist // RUNS THE METHOD RUGHT BEFORE THE OBJECT IS CREATED
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
		@PreUpdate // RUNS A METHOD WHEN THE OBJECT IS MODIFIED
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
	
		// CREATE THE REST OF THE OF THE GETTERS AND SETTERS.
		
		
// GETTERS / SETTERS / OTHER METHODS
	
	
	
	
	

}
