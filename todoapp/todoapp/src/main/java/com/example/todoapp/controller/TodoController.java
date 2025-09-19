package com.example.todoapp.controller;

import com.example.todoapp.model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.todoapp.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = {"http://localhost:5173","http://127.0.0.1:5173"}) // change to specific origin in production
public class TodoController {
    private final TodoService service;


    public TodoController(TodoService service) { this.service = service; }


    @GetMapping
    public List<Todo> getAll() { return service.findAll(); }


    @GetMapping("/{id}")
    public ResponseEntity<Todo> getOne(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return service.save(todo); }


    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable Long id, @RequestBody Todo t) {
        return service.findById(id).map(existing -> {
            existing.setTitle(t.getTitle());
            existing.setDescription(t.getDescription());
            existing.setCompleted(t.isCompleted());
            return ResponseEntity.ok(service.save(existing));
        }).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

