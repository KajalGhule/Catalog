package com.tap.controller;

import com.tap.catalog.Product;

import om.tap.service.ProductService;

public class ProductController {
	ProductService productService = new ProductService();
	public void addProduct(Product product) {
		productService.addProduct(product);
    }
	public void displayAll() {
		productService.displayAll();
	}
	public Product updateProductById(int id) {
		Product existingProduct = productService.updateProductById(id);
		return existingProduct;
	}
	public void deleteProductByTitle(String title) {
		productService.deleteProductByTitle(title);
	}
	public void loadProducts() {
		productService.loadProducts();
	}
	public void saveProducts() {
		productService.saveProducts();		
	}
}
