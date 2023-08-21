package com.demogiohang.service;

import java.util.List;

import java.util.Optional;

import com.demogiohang.entity.Product;

public interface ProductService {

	List<Product> findAll();

	Product findById(String id);

	List<Product> findByCategoryId(String id);

	Product create(Product product);

	Product update(Product product);

	void delete(String id);

	List<Product> findProduct(String request);

}
