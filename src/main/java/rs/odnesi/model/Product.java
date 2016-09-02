package rs.odnesi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String productName;
	@OneToMany
	private List<Ingredients> ingredients;
	private boolean productEnabled;
	@ManyToOne
	@JoinColumn(name="companyId")
	private Company company;
}
