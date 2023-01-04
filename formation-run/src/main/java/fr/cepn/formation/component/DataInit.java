package fr.cepn.formation.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.cepn.formation.jpa.entities.Product;
import fr.cepn.formation.jpa.repositories.ProductRepository;

@Component
public class DataInit implements CommandLineRunner{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product("SpringBoot pour les null", 0));
	}

}
