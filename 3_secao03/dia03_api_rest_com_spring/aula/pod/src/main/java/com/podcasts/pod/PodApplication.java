package com.podcasts.pod;

import com.podcasts.pod.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PodApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodApplication.class, args);
		Person person = new Person("Maria",30);
		System.out.println(person.name());
		System.out.println(person.age());
	}

}
