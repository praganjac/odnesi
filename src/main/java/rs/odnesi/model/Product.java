package rs.odnesi.model;

import java.util.List;

import javax.persistence.*;

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
	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderItem> orderItems;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Ingredients> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredients> ingredients) {
		this.ingredients = ingredients;
	}

	public boolean isProductEnabled() {
		return productEnabled;
	}

	public void setProductEnabled(boolean productEnabled) {
		this.productEnabled = productEnabled;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
