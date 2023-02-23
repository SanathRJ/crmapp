package com.zohocrmapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Billing extends AbsractClass{
	@Column(name="first_name",nullable=false)
private String firstName;
	@Column(name="last_name",nullable=false)
private String lastName;
	@Column(name="email",nullable=false)
private String email;
	@Column(name="mobile",nullable=false)
private long mobile;
	@Column(name="source",nullable=false)
private String source;
	@Column(name="product",nullable=false)
private String product;
	@Column(name="quantity",nullable=false)
private long quantity;
	@Column(name="amount",nullable=false)
private int amount;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
