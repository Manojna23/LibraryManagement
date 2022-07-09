package org.library.controller;

import org.library.dao.BookRepository;
import org.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    List<Book> getAllBooks() {
        System.out.println(bookRepository.findAll());
        return bookRepository.findAll();
    }

    @GetMapping("/book/{id}")
    Book getById(@PathVariable Integer id) {
        return bookRepository.findById(id).get();
    }

    @PostMapping("/book")
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Added the book";
    }

    @DeleteMapping("/deleteBook")
    public String deleteBook(@PathVariable Integer id) {
        bookRepository.deleteById(id);
        return "Delete done";
    }
}
