package com.example.demolink.services;

import com.example.demolink.Book;
import com.example.demolink.model.UserFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// бизнес-логика - благодаря данной аннотиции внедрили методы в Bookcontrtoller.
@Service
public class ServicesUser {

    List<Book> boks = new ArrayList<>();
    //добавление книги
    public void creatBook(Book book) {
        if(boks.contains(book)){
            throw new UserFoundException("Книга уже найдена");
        }
        boks.add(book);
    }

    //удаляеми книгу
    public void removeBook(int element) {
        boks.remove(element);
    }

    //получение всех книг(из списка)
    public List<Book> books() {
        return boks;
    }


}
