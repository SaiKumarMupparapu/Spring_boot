package com.Examole.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Examole.demo.Entity.Product;

import com.Examole.demo.Repo.ProductReppo;

@Service
public class ProductService implements ProductServiceInterface {
	@Autowired
	private ProductReppo pr;

	@Override
	public Boolean saveProduct(Product p) {
		Product saved = pr.save(p);
		return saved.getPrice() != null;
	}

	@Override
	public List<Product> getAllProducts() {
		return pr.findAll();
	}

	@Override
	public Product getProductById(Long Id) {
		Optional<Product> optional = pr.findById(Id);
		Product product = null;
		if (optional.isPresent()) {
			product = optional.get();
		}
		return product;
	}

	@Override
	public void DeleteProduct(Long id) {
		pr.deleteById(id);
	}

}
