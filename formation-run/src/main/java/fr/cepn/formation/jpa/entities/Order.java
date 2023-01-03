package fr.cepn.formation.jpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="`Order`")
@SequenceGenerator(name = "seq_order", sequenceName = "seq_order", allocationSize = 1)
public class Order {

	  @Id   // Clé primaire. Plusieurs attributs @Id en cas de clé primaire composite
	  @GeneratedValue(strategy=GenerationType.AUTO)  // PK généré automatiquement
	  private long id; 
}
