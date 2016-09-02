package rs.odnesi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	private String orderCode;
	private Date orderDate;
	@ManyToOne
	@JoinColumn(name="userDetailId")
	private UserDetail userDetail;
	private boolean orderAcceptedByCompany;
	private boolean orderAcceptedByUser;
	private String orderNotes;
	private Date orderExpirationDate;
	

}
