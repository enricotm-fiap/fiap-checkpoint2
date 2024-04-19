package br.com.fiap.checkpoint2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("br.com.fiap.model")
public class Checkpoint2Application {

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint2Application.class, args);
	}

}
