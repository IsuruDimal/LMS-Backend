package com.librarysys.librarysys;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibrarysysApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarysysApplication.class, args);
    }
@Bean
    public ModelMapper modelMapper(){
       return new ModelMapper();

}



}
