package com.example.springsecurity;

import com.example.springsecurity.todo.domain.Todo;
import com.example.springsecurity.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Collection;

@SpringBootApplication
public class SpringsecurityApplication {

    @Autowired
    public TodoRepository todoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }


}
