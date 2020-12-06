package com.cinemaprime.backend;

import com.cinemaprime.backend.db.PersonRepository;
import com.cinemaprime.backend.dbmodels.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	/* public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Person("Alice", "Smith"));
		repository.save(new Person("Bob", "Smith"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Person person : repository.findAll()) {
			System.out.println(person);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstname("Alice"));

		System.out.println("Customers found with findByLastName('Smith'):");
		System.out.println("--------------------------------");
		//for (Person person : repository.findByLastname("Smith")) {
		//System.out.println(person);
		//}

  } */

}
