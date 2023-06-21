package com.microservice.ProductService.rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	@RequestMapping
	public String createProduct() {
		return "Post";
	}

	@GetMapping
	public String getProduct() {
		return "Get";
	}

	@PutMapping
	public String updateProduct() {
		return "Put";
	}

	@DeleteMapping
	public String deleteProduct() {
		return "Delete";
	}

}
