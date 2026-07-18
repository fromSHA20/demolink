package com.example.demolink.BookService;

import com.example.demolink.Book;
import com.example.demolink.dto.BookDto;
import com.example.demolink.repositori.RepositoriUser;
import org.hibernate.mapping.Array;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //
public class BookService {

    RepositoriUser repositoriUser;
    public BookService(RepositoriUser repository){
        this.repositoriUser = repository;
    }
    public void addBook(Book book){
        repositoriUser.save(book);
    }

    public void deletBook(Book book){
        repositoriUser.delete(book);
    }

    public Book getBook(int id){
       return repositoriUser.findById(id).get();
    }
    public List <Book> findAllBook(){
        return repositoriUser.findAll();
    }
    public void upDateBook(int id, BookDto bookDto){
       Book myBook = repositoriUser.findById(id).get();
       myBook.id = id;
       myBook.year = bookDto.year;
       myBook.author = bookDto.author;
       myBook.title = bookDto.title;
       repositoriUser.save(myBook);
    }



}
