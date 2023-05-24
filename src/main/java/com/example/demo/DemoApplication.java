package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoApplication  implements CommandLineRunner {
	@Autowired
	TaskService taskService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
    public void run(String... args) throws Exception {
        System.out.println(taskService.execute());
    }

}
