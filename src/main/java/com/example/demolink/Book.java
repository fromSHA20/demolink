package com.example.demolink;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
//предназначен для автоматического создания таблиц с определенными параметрами которые прописаны в классе
//для ENTITY - обязательно требуется полный конструктор @AllArgsConstructor @NoArgsConstructor @Data
@Entity
public class Book {
    @Id //ставим уникальный PRIMARY KEY
    @GeneratedValue (strategy = GenerationType.AUTO) //При создании книги автоматический делает поле +1
    public int id;
    public String title;
    public String author;
    public int year;

    public Book(String title, String author, int year){
        this.author = author;
        this.title = title;
        this.year = year;
    }

}
