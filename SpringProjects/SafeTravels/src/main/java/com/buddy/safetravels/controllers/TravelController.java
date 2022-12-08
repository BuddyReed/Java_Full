package com.buddy.safetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.buddy.safetravels.models.Travel;
import com.buddy.safetravels.services.TravelService;



@Controller 
public class TravelController {

	@Autowired
	TravelService travelServ; 

	@GetMapping("/travels/{id}")
	public String showOneTravel(
		@PathVariable("id") Long id,	
		Model model 
	){
		// Retrieve on user from DB
		Travel oneTravel = travelServ.findTravel(id);
		// Pass the information to the DB
		model.addAttribute("travel", oneTravel);
		return "show.jsp";
	}
	
//	// showing all travels???
//    @RequestMapping("/travels")
//    public String index(Model model) {
//        List<Travel> travels = travelServ.allTravels();
//        model.addAttribute("travels", travels);
//        return "index.jsp";
//    }
//	
   // HAVEN"T CREATE BELOW
    
 // Note: We'll be altering this a bit after we introduce data binding.
//    @PostMapping("/travels")
//    public String create(
//        @RequestParam("title") String expense,
//        @RequestParam("description") String description,
//        @RequestParam("language") String vendor,
//        @RequestParam("pages") Double amount) 
//    {
        // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//        Travel travel = new Travel(expense, description, vendor, amount);
//        travelServ.createTravel(travel);
//        return "redirect:/dashboard";
//    }
    
		//  CREATE A BOOK WITH DATABINDING & @ModelAttribute
		//  gets the form
//		  @GetMapping("/travels/new")
//		  public String newTravel(@ModelAttribute("aTravel") Travel emptyTravelObj) {
//		  return "new.jsp";
//		  }
//		//  processes the form
//		  @PostMapping("/travels")
//		  public String create(@Valid @ModelAttribute("aTravel") Travel filledTravelObj, BindingResult result) {
//		  if (result.hasErrors()) {
//		      return "new.jsp";
//		  } else {
//		      travelServ.createTravel(filledTravelObj);
//		      return"redirect:/travels";
//	        }
//		  }
    
		
    //Assignment______________________________
		  
// We created all travel expense on one page (READ ALL) 
//	and collected new travel expense via the form (CREATE)
	    @GetMapping("/expense")
	    public String index(Model model, 
	    		@ModelAttribute("aTravel") 
	    		Travel emptyTravelObj
	    		) {
	        List<Travel> travels = travelServ.allTravels();
	        model.addAttribute("travels", travels);
	        return "index.jsp";
	    }  
	    
		//  processes the form
		  @PostMapping("/expense")
		  public String create(
				  @Valid @ModelAttribute("aTravel") 
				  Travel filledTravelObj, BindingResult result
		  ) {
		  if (result.hasErrors()) {
		      return "index.jsp";
		  } else {
		      travelServ.createTravel(filledTravelObj);
		      return"redirect:/expense";
	        }
		  }
		  
//		  Page One Above See Notes Above 
		  
		  
//		 UPDATE EXPENSE 
		  
		 @GetMapping("/expense/edit/{id}")
		 public String edit(
				 @PathVariable("id") Long travelId,
				 Model model
		) {
			 // Grab one travel expense from DB
			 Travel oneTravel = travelServ.findTravel(travelId);
			// Pass one user to JSP
			 model.addAttribute("travelObj", oneTravel);
			 return "edit.jsp";
		 }
		 
//		  This is the same code from create
		 @PutMapping("/expense/edit/{id}")
		  public String update(
				  @Valid @ModelAttribute("aTravel") 
				  Travel filledTravelObj, BindingResult result
		  ) {
		  if (result.hasErrors()) {
		      return "edit.jsp";
		  } else {
		      travelServ.createTravel(filledTravelObj);
		      return"redirect:/expense";
	        }
		  }
		 
//		 DELETE 
		 
		 @DeleteMapping("/travel/{id}")
		 public String deleteTravel(@PathVariable("id") Long travelId){
			 travelServ.deleteTravel(travelId);
			 return "redirect:/expense";
			 
		 }
		 
		 
		 
		 

	
}
