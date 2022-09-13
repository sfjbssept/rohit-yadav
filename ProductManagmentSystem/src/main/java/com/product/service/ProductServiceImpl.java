package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository;
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}
	@Override
	public Optional<Product> getProductID(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	@Override
	public void deleteProductId(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

}
