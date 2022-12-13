package com.buddy.bookclub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buddy.bookclub.models.Book;
import com.buddy.bookclub.repositories.BookRepository;
import com.buddy.bookclub.repositories.UserRepository;

@Service 
public class BookService {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	// ------------- CRUD FOR MANY FROM THE ONE TO MANY SIDE (MANY NINJAS ----------------//	
		// CREATE
		public Book createBook(Book book) {
			return bookRepo.save(book);
		}
		// READ ONE
		public Book getOneBook(Long id) {
			return bookRepo.findById(id).orElse(null);
		}
		// READ ALL
		public List<Book> getAllBooks(){
			return bookRepo.findAll();
		}
		// UPDATE
		public Book updateBook(Book updatedBook) {
			return bookRepo.save(updatedBook);
		}
		// DELETE
		public void deleteBook(Long id) {
			bookRepo.deleteById(id);
		}
	

}
