package rs.odnesi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userDetailId;
	private String userDetailFirstName;
	private String userDetailLastName;
	

}
