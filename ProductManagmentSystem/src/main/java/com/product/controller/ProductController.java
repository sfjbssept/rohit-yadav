package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@PostMapping("/addPoduct")
	private Integer addProduct(Product product) {
		Product productobj = productService.save(product);
		return productobj.getId();
		
	}

}
