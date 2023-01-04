package fr.cepn.formation.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import fr.cepn.formation.jpa.entities.Product;

public interface Supplier extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product>{

}
