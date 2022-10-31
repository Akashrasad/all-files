package com.product.maven_demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name ="employee")
public class product {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column(name="name")
	String name;
	@Column(name="type")
	String type;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public product(int id, String name, String type, String email) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", type=" + type + ", email=" + email + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getType()=" + getType() + ", getEmail()=" + getEmail() + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
@Column(name="email")
	String email;

	public product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
