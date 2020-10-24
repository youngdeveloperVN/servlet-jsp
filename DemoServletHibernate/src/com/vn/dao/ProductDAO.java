package com.vn.dao;

import java.util.List;

import com.vn.entities.Product;

public interface ProductDAO {

	public Product create(Product product);
	public List<Product> findAll();

}
