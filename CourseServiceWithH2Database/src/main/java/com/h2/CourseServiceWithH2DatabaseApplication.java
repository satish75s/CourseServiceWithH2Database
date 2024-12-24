package com.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseServiceWithH2DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceWithH2DatabaseApplication.class, args);
	}

}
