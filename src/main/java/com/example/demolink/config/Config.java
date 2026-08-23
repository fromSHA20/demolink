package com.example.demolink.config;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration

public class Config {
    @Bean("getText")
    public String getText() {
        System.out.println("Hello world");
        return "Hello world, kak dela? ";
    }

}
