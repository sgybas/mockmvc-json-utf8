package com.example.mockmvcjsonutf8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MockmvcJsonUtf8Application {

	public static void main(String[] args) {
		SpringApplication.run(MockmvcJsonUtf8Application.class, args);
	}

}

@RestController
class TestController {

	@GetMapping("/")
	public Person person() {
		return new Person("Jürgen");
	}
}

class Person {

	private final String name;

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
