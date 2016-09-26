package rs.odnesi.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<OrderItem> orderItems;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	public boolean isOrderAcceptedByCompany() {
		return orderAcceptedByCompany;
	}

	public void setOrderAcceptedByCompany(boolean orderAcceptedByCompany) {
		this.orderAcceptedByCompany = orderAcceptedByCompany;
	}

	public boolean isOrderAcceptedByUser() {
		return orderAcceptedByUser;
	}

	public void setOrderAcceptedByUser(boolean orderAcceptedByUser) {
		this.orderAcceptedByUser = orderAcceptedByUser;
	}

	public String getOrderNotes() {
		return orderNotes;
	}

	public void setOrderNotes(String orderNotes) {
		this.orderNotes = orderNotes;
	}

	public LocalDateTime getOrderExpirationDate() {
		return orderExpirationDate;
	}

	public void setOrderExpirationDate(LocalDateTime orderExpirationDate) {
		this.orderExpirationDate = orderExpirationDate;
	}
}
