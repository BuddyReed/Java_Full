package com.buddy.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.buddy.mvc.models.Book;
import com.buddy.mvc.services.BookService;

@Controller 
public class BookController {

	@Autowired
	BookService bookServ; 

	@GetMapping("/books/{id}")
	public String showOneBook(
		@PathVariable("id") Long id,	
		Model model 
	){
		// Retrieve on user from DB
		Book oneBook = bookServ.findBook(id);
		// Pass the information to the DB
		model.addAttribute("book", oneBook);
		return "show.jsp";
	}
	
	// showing all books???
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookServ.allBooks();
        model.addAttribute("books", books);
        return "index.jsp";
    }
	
   // HAVEN"T CREATE BELOW
    
 // Note: We'll be altering this a bit after we introduce data binding.
    @PostMapping("/books")
    public String create(
        @RequestParam("title") String title,
        @RequestParam("description") String description,
        @RequestParam("language") String language,
        @RequestParam("pages") Integer pages) 
    {
        // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
        Book book = new Book(title, description, language, pages);
        bookServ.createBook(book);
        return "redirect:/dashboard";
    }

//	
//	}
	
}
