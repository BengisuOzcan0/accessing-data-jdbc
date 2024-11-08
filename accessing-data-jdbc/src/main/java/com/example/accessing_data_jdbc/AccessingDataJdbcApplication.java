package com.example.accessing_data_jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJdbcApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {

			repository.save(new Customer("Bengisu", "Özcan"));
			repository.save(new Customer("Ali", "Veli"));
			repository.save(new Customer("Ayşe", "Yılmaz"));


			System.out.println("Customer :");
			repository.findAll().forEach(System.out::println);
		};
	}
}