package com.buddy.beltexam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buddy.beltexam.models.Baby;
import com.buddy.beltexam.repositories.BabyRepository;
import com.buddy.beltexam.repositories.UserRepository;

@Service 
public class BabyService {

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BabyRepository babyRepo;
	
	// ------------- CRUD FOR MANY FROM THE ONE TO MANY SIDE (MANY NINJAS ----------------//	
	// CREATE
	public Baby createBaby(Baby baby) {
		return babyRepo.save(baby);
	}
	// READ ONE
	public Baby getOneBaby(Long id) {
		return babyRepo.findById(id).orElse(null);
	}
	// READ ALL
	public List<Baby> getAllBabys(){
		return babyRepo.findAll();
	}
	// UPDATE
	public Baby updateBaby(Baby updatedBaby) {
		return babyRepo.save(updatedBaby);
	}
	// DELETE
	public void deleteBaby(Long id) {
		babyRepo.deleteById(id);
	}
	
	
}
