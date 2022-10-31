package project1.springdemo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product
{
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Id
	Long id;
	@Column(name = "name",nullable = false)
	String name;
	double price;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
