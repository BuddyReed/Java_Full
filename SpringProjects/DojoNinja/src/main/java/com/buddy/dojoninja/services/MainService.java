package com.buddy.dojoninja.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buddy.dojoninja.models.Dojo;
import com.buddy.dojoninja.models.Ninja;
import com.buddy.dojoninja.repositories.DojoRepository;
import com.buddy.dojoninja.repositories.NinjaRepository;

@Service 
public class MainService {

	@Autowired
	DojoRepository dojoRepo;
	
	@Autowired
	NinjaRepository ninjaRepo;
	
	
	// ------------- CRUD FOR Dojo ----------------//
	// CREATE
	public Dojo createDojo(Dojo newDojo) {
		return dojoRepo.save(newDojo);
	}
	// READ ONE
	public Dojo getOneDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
	// READ ALL
	public List<Dojo> getAllDojos(){
		return dojoRepo.findAll();
	}
	// UPDATE
	public Dojo updateDojo(Dojo updatedDojo) {
		return dojoRepo.save(updatedDojo);
	}
	// DELETE
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}
	
	
	// ------------- CRUD FOR NINJA ----------------//
	// CREATE
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	// READ ONE
	public Ninja getOneNinja(Long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
	// READ ALL
	public List<Ninja> getAllNinjaes(){
		return ninjaRepo.findAll();
	}
	// UPDATE
	public Ninja updateNinja(Ninja updatedNinja) {
		return ninjaRepo.save(updatedNinja);
	}
	// DELETE
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}
