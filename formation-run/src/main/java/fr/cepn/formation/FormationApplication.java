package fr.cepn.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class FormationApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(FormationApplication.class); 
	
	public static void main(String[] args) {
		SpringApplication.run(FormationApplication.class, args);
		logger.info("Lancement de l'application");
	}

}
