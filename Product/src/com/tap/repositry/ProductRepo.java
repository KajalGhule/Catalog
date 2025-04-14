package com.tap.repositry;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.tap.catalog.Product;

public class ProductRepo {
	Scanner sc = new Scanner(System.in); 
	private ArrayList<Product> productList = new ArrayList<>();
	private final String fileName = "products.dat";
	 
	 	// CRUD Create and Add
	    public void addProduct(Product product) {
	        productList.add(product);
	    }
	    // Read Product List
	    public void displayAll() {
	        for (Product p : productList) {
	            p.display();
	            System.out.println("-----------------");
	        }
	    }
	    // Update Product List
	    /*
	     * 1. Find product by id
	     * 2. remove product by id
	     * 3. then update existing product
	     * 4. add product in list 
	     * */
	    public Product updateProductById(int id) {
	    	System.out.println("updateProductById 1");
	    	Product existingProduct = null;
	    	for (Product product : productList) {
				if(product.getId() == id) {
					System.out.println("updateProductById 1");
					existingProduct = product;
					break;
				}
			}
	    	if(existingProduct != null) {
	    		productList.remove(existingProduct);
	    		
	    		System.out.println("-------------Update Existing Product---------------------");
	    		System.out.println("Enter Product Title");
	    		existingProduct.setTitle(sc.nextLine());
	    		System.out.println("Enter Product Desc");
	    		existingProduct.setDesc(sc.nextLine());
	    		System.out.println("Enter Product Price");
	    		existingProduct.setUnitPrice(sc.nextDouble());
	    		System.out.println("Enter Product Quantity");
	    		existingProduct.setQuantity(sc.nextInt());
	    		
	    		productList.add(existingProduct);
	    		System.out.println("Product updated successfully !!!!");
	    		return existingProduct;
	    	} else {
	    		System.out.println("Product with Product id " + id+ " not found");
	    		return null;
	    	}
	    	
	    }
	    //Remove Product By Title from the List
	    public void deleteProductByTitle(String title) {
	    	for (Product product : productList) {
				if(product.getTitle().equalsIgnoreCase(title)) {
					productList.remove(product);
					break;
				}
			}
	    }
	    
	    public void loadProducts() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	            productList = (ArrayList<Product>) ois.readObject();
	            System.out.println("Products loaded from file.");
	        } catch (Exception e) {
	            System.out.println("No existing product file found. Starting fresh.");
	        }
	    }
	    
	    public void saveProducts() {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	            oos.writeObject(productList);
	            System.out.println("Products saved to file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    
}

