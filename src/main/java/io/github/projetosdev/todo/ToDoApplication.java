package io.github.projetosdev.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.projetosdev.todo.repository.TodoRepository;

@SpringBootApplication
public class ToDoApplication {

	@Autowired
	private TodoRepository todoRepository;

	/*
	 * O método CommandLineRunner init() executa uma ação ao iniciar a aplicação.
	 * 
	 * @Bean public CommandLineRunner init() { return new CommandLineRunner() {
	 * 
	 * @Override public void run(String... args) throws Exception { Todo todo = new
	 * Todo(); todo.setDescription("Estudar Spring");
	 * todo.setCreatedDate(LocalDateTime.now()); todoRepository.save(todo); } }; }
	 */
	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

}
