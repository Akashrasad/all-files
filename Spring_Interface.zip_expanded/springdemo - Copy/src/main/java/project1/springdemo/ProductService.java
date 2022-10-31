package project1.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
	@Autowired
	Myrepo myrepo;
	public  List<Product> displayData()
	{
		 return myrepo.findAll();
	}
	public void saveProduct(Product product)
	{
		myrepo.save(product);
	}
	public Product getProd(long id)
	{
		return myrepo.findById(id).get();
	}
	public void delete(long id)
	{
		myrepo.deleteById(id);
	}
}