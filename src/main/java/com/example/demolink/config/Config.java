package com.example.demolink.config;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration

public class Config {
    @Bean("getText")
    public String getText() {
        return "Hello world, kak dela? ";
    }

}
