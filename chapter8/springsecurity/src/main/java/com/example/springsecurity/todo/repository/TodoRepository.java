package com.example.springsecurity.todo.repository;

import com.example.springsecurity.todo.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>{

}
