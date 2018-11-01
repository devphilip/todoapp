package com.devphilip.todoapp.repositories;

import com.devphilip.todoapp.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<Todo, String> {
}
