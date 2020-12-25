package io.github.projetosdev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.projetosdev.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	
	
}
