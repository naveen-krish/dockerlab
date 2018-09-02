package lab.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("lab.db")
public class SpringBootBasicCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicCrudApplication.class, args);
	}
	
}
