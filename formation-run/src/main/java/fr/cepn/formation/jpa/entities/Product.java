package fr.cepn.formation.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Product")
@SequenceGenerator(name = "seq_product", sequenceName = "seq_product", allocationSize = 1)
@Getter
@Setter
public class Product {

	  @Id   // Clé primaire. Plusieurs attributs @Id en cas de clé primaire composite
	  @GeneratedValue(strategy=GenerationType.AUTO)  // PK généré automatiquement
	  private long id; 

	  @Column(name="explanation", nullable=false, length=512) 
	  // Champ dont le nom est différent en base => utilisation @Column
	  private String description;

	  private Integer price; 

	  @Transient 
	  // Indique à JPA d’ignorer le champ
	  long orderCount;

	  // getters/setters

}
