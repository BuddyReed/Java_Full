package com.buddy.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buddy.mvc.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
    // this method retrieves all the books from the database
    List<Book> findAll();

    
    // A method that lets you call delete by id
    
    // this method finds books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}	

