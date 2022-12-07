package com.buddy.mvc.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.buddy.mvc.models.Book;
import com.buddy.mvc.repositories.BookRepository;
@Service
public class BookService {
	 // adding the book repository as a dependency
	 private final BookRepository bookRepository;
	 
	 public BookService(BookRepository bookRepository) {
	     this.bookRepository = bookRepository;
	 }
	 // returns all the books
	 public List<Book> allBooks() {
	     return bookRepository.findAll();
	 }
	 // creates a book
	 public Book createBook(Book b) {
	     return bookRepository.save(b);
	 }
	 // retrieves a book
	 public Book findBook(Long id) {
		 return bookRepository.findById(id).orElse(null);
		 
//		 Optional<Book> optionalBook = bookRepository.findById(id);
//	     if(optionalBook.isPresent()) {
//	         return optionalBook.get();
//	     } else {
//	         return null;
//	     }
	 }
	 
	 // UPDATE BOOK
	 public Book updateBook(Long id, String title, String desc, String lang, int numOfPages) {
		 // Putting new book (whatever) into variable new book
		 Book newBook = findBook(id);
		 // Setting/updating the new books information
		 newBook.setTitle(title);
		 newBook.setDescription(desc);
		 newBook.setLanguage(lang);
		 newBook.setNumberOfPages(numOfPages);
		 // we then return updated book.
		 return bookRepository.save(newBook);
	 }
	 
	 // 
	 public void deleteBook(long id) {
		 bookRepository.deleteById(id);
	 }
}
