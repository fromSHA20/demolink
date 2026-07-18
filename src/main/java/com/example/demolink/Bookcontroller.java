package com.example.demolink;

import com.example.demolink.services.ServicesUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
//- библиотека которая добавляет логирование - есть разные уровни логирования(Error- ошибки, info- информационные, warn-предупреждения)
@RestController

public class Bookcontroller {
    ServicesUser servicesUser;
    String username;
    String getText;

    //@Qualifier - дает понять куда ссылаться Bean при запросе на сервер
    public Bookcontroller(ServicesUser servicesUser, @Qualifier("helloworld") String username, @Qualifier("getText") String getText) {
        this.servicesUser = servicesUser;
        this.username = username;
        this.getText = getText;
    }

    //добавление книги
    @PostMapping("/creatBook")
    public void creatBook(@RequestBody Book book) {
        servicesUser.creatBook(book);
    }

    //удаляеми книгу
    @DeleteMapping("/removeBook")
    public void removeBook(int element) {
        System.out.println();
        servicesUser.removeBook(element);
    }

    //получение всех книг(из списка)
    @GetMapping
    public List<Book> books() {
        return servicesUser.books();
    }

    @GetMapping("/text")
    public String text() {
        return getText;
    }


}
