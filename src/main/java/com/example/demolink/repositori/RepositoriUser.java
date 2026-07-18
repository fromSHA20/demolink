package com.example.demolink.repositori;

import com.example.demolink.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //JpaRepository - автоматический добавляет SQL запросы и работает с таблицей Book (по факту в Java-class)
// (УКАЗЫВАЕМ ДАННЫЕ АВТОМАТИЧЕСКИЙ: создание, удаление, изменение, получение)
public interface RepositoriUser extends JpaRepository <Book,Integer>  {



}
