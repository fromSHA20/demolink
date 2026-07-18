package com.example.demolink.BookService;


import com.example.demolink.Book;
import com.example.demolink.dto.BookDto;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")

public class Bookcontrollerone {
    BookService bookService;

    public Bookcontrollerone(BookService bookService){
     this.bookService = bookService;
    }
    @PostMapping("/saveBook")
    public void saveBook(@RequestParam String title, String author, int year){
        bookService.addBook(new Book(title, author, year));
    }
    @DeleteMapping("/deletBook")
    public void deletBook(@RequestParam String title, String author, int year){
        bookService.deletBook(new Book(title, author,year));
    }
    @GetMapping("/getBook")
    public Book getBook(@RequestParam int id){
       return bookService.getBook(id);
    }
    @GetMapping("/findAllBook")
    public List<Book> findAllBook(){
        return bookService.findAllBook();
    }
    @PutMapping("/upDateBook")
    public void upDateBook(@RequestParam int id, @RequestBody BookDto bookDto){
        bookService.upDateBook(id, bookDto);
    }

}
