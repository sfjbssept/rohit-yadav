package com.product.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.Entity.Product;
import com.product.Services.IProductService;

@RestController
public class ProductController {
	
	// CRUD c-> create, R-> Read, U-> update and D-> delete 
	
	@Autowired
	IProductService productService;
	
	@PostMapping("/addproduct") 
	Integer addProduct(@RequestBody Product product) {
		Integer id = productService.addProduct(product);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allproducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	
	@GetMapping("/product/{id}") 
	Optional<Product> getProduct(@PathVariable Integer id) {
		Optional<Product> product = productService.getProduct(id);
		return product;
	}
	
	@PutMapping("/update/{Id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("Id") Integer Id,@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.updateProduct(product, Id), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/del/{Id}") 
	public ResponseEntity<Product> deleteProduct(@PathVariable Integer Id) {
		System.out.println(Id);
		ResponseEntity<Product> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			productService.deleteProduct(Id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
			// TODO: handle exception
		}
		return responseEntity;
	}
	

}
