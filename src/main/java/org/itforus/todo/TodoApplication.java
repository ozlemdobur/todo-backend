package org.itforus.todo;

import org.itforus.todo.model.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.itforus.todo.repository.UserRepository;


@SpringBootApplication

public class TodoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		userRepository.save(new UserDB(null,"Ozlem","ozi@gmail.com"));
		userRepository.save(new UserDB(null,"Sinan","ozi@gmail.com"));

	}

}
