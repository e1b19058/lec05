package oit.is.team15.work05.lec05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Lec05Application {

	public static void main(String[] args) {
		SpringApplication.run(Lec05Application.class, args);
	}

}
