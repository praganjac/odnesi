package rs.odnesi.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="orders")
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
	private LocalDateTime orderExpirationDate;
	

}
