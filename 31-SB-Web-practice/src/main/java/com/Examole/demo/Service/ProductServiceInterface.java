package com.Examole.demo.Service;

import java.util.List;

import com.Examole.demo.Entity.Product;

public interface ProductServiceInterface {

	public Boolean saveProduct(Product p);

	public List<Product> getAllProducts();

	public Product getProductById(Long Id);

	public void DeleteProduct(Long id);

}
