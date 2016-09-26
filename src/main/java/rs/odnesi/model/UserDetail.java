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

	public long getUserDetailId() {
		return userDetailId;
	}

	public void setUserDetailId(long userDetailId) {
		this.userDetailId = userDetailId;
	}

	public String getUserDetailFirstName() {
		return userDetailFirstName;
	}

	public void setUserDetailFirstName(String userDetailFirstName) {
		this.userDetailFirstName = userDetailFirstName;
	}

	public String getUserDetailLastName() {
		return userDetailLastName;
	}

	public void setUserDetailLastName(String userDetailLastName) {
		this.userDetailLastName = userDetailLastName;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
