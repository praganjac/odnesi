package rs.odnesi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userDetailId;
	private String userDetailFirstName;
	private String userDetailLastName;
	@OneToMany(mappedBy="userDetail")
	private List<Order> orders;
	

}
