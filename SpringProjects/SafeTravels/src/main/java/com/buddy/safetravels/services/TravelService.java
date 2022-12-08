package com.buddy.safetravels.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.buddy.safetravels.models.Travel;
import com.buddy.safetravels.repositories.TravelRepository;

@Service
public class TravelService {
	 // adding the travel repository as a dependency
	 private final TravelRepository travelRepository;
	 
	 public TravelService(TravelRepository travelRepository) {
	     this.travelRepository = travelRepository;
	 }
	 // returns all the travels
	 public List<Travel> allTravels() {
	     return travelRepository.findAll();
	 }
	 // creates a travel
	 public Travel createTravel(Travel b) {
	     return travelRepository.save(b);
	 }
	 // retrieves a travel
	 public Travel findTravel(Long id) {
		 return travelRepository.findById(id).orElse(null);
		 
//		 Optional<Travel> optionalTravel = travelRepository.findById(id);
//	     if(optionalTravel.isPresent()) {
//	         return optionalTravel.get();
//	     } else {
//	         return null;
//	     }
	 }
	 
	 // UPDATE BOOK
	 public Travel updateTravel(Long id, String expense, String desc, String vendor, Double amount) {
		 // Putting new travel (whatever) into variable new travel
		 Travel newTravel = findTravel(id);
		 // Setting/updating the new travels information
		 newTravel.setExpense(expense);
		 newTravel.setDescription(desc);
		 newTravel.setVendor(vendor);
		 newTravel.setAmount(amount);
		 // we then return updated travel.
		 return travelRepository.save(newTravel);
	 }
	 
	 // 
	 public void deleteTravel(long id) {
		 travelRepository.deleteById(id);
	 }
}
