package com.product.service;

import java.util.Optional;

import com.product.entity.Product;

public interface ProductService {

	Product save(Product product);

	Optional<Product> getProductID(Integer id);

	void deleteProductId(Integer id);

}
