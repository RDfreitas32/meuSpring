package com.springproject.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springproject.demo.entities.User;
import com.springproject.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	// Para executar automaticamente a interface CommandLineRunner
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		// Inserindo os dois objetos no banco de dados através do userRepository
		//passando uma lista de objetos o saveAll salva essa lista no BD
		userRepository.saveAll(Arrays.asList(u1, u2));

	}
	
	
}
