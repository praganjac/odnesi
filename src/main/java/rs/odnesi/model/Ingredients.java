package rs.odnesi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredients {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String ingredientName;
	private boolean enabled;
	

}
