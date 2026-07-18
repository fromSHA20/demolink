package com.example.demolink.configuration;

import org.springframework.context.annotation.Bean;

//Подразумевает настройку кода/приложения
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean("helloworld")
    public String helloworld() {
        return "zapros po spisky knig";
    }
}
