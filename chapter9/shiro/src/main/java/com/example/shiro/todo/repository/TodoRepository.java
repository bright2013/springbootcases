package com.example.shiro.todo.repository;


import com.example.shiro.todo.domain.Todo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>{

}
