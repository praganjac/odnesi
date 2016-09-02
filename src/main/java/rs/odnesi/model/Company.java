package rs.odnesi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long companyId;
	private String companyName;
	@OneToMany(mappedBy="company")
	private List<Product> products;
	
	
	

}
