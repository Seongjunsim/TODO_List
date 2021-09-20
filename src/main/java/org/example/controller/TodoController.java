package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.model.TodoResponse;
import org.example.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@AllArgsConstructor
@RequestMapping("/")
public class TodoController {

  private final TodoService service;

  @PostMapping
  public ResponseEntity<TodoResponse> create(){
    System.out.println("Create");
    return null;
  }

  @GetMapping("{id}")
  public ResponseEntity<TodoResponse> readOne(){
    return null;
  }

  @GetMapping
  public ResponseEntity<List<TodoResponse>> readAll(){
    return null;
  }

  @PatchMapping
  public ResponseEntity<TodoResponse> update(){
    return null;
  }

  @DeleteMapping("{id}")
  public ResponseEntity<?> deleteOne(){
    return null;
  }

  @DeleteMapping
  public ResponseEntity<?> deleteAll(){
    return null;
  }
}
