package com.buddy.fullcrud.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

// A REPOSITORY WILL BE CREATE FOR EVERY MODEL THAT WAS CREATED  
//(START WITH THE CLASS NAME THEN THEN REPOSITORY
@Repository
public interface FullCrudRepository extends CrudRepository<FullCrud, Long> {
	List<FrullCrud> findAll();
	
	

}
