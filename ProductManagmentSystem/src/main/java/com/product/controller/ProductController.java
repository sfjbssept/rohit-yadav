package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.repo.ProductRepository;
import com.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductRepository repository;
	
	
	@PostMapping("/addPoduct")
	private Integer addProduct(Product product) {
		Product productobj = productService.save(product);
		return productobj.getId();
		
	}
	
	@GetMapping("/getPoduct")
	private List<Product> getProductList(){
		return repository.findAll();
	}
	
	
	@GetMapping("/Product/{id}")
	private Optional<Product> getProductID(@PathVariable Integer id) {
		return productService.getProductID(id);
		
	}
	
	@DeleteMapping("/Product/{id}")
	private void deleteProduct(@PathVariable Integer id) {
		productService.deleteProductId(id);
	}

}
