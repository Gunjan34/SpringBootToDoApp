package com.example.todoapp.service;

import com.example.todoapp.model.Todo;
import org.springframework.stereotype.Service;
import com.example.todoapp.repository.TodoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository repo;

    public TodoService(TodoRepository repo){
        this.repo = repo;
    }

    public List<Todo> findAll(){
        return repo.findAll();
    }
    public Optional<Todo> findById(Long id){
        return repo.findById(id);
    }
    public Todo save(Todo t){
        return repo.save(t);
    }
    public void deleteById(Long id){
        repo.deleteById(id);
    }
}
