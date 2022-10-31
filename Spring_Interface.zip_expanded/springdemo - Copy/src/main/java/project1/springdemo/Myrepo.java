package project1.springdemo;

import org.springframework.data.jpa.repository.JpaRepository;



public interface Myrepo extends JpaRepository<Product, Long>
{
	
}
