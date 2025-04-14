package com.tap.catalog;

import java.util.Scanner;

import com.tap.controller.ProductController;

public class Main {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choose;
		System.out.println("1. Add Product");
		System.out.println("2. Display All Products");
		System.out.println("3. Update Product");
		System.out.println("4. Remove Product");
		System.out.println("5. Exist");
		choose = sc.nextInt();
		return choose;
	}
	public static void main(String[] args) {
		ProductController productController = new ProductController();
		Scanner sc = new Scanner(System.in);
		productController.loadProducts();
		int option;
        do {
        	option = menu();
		switch (option) {
		case 1:
			System.out.println("Inside Add Product");
			Product p = new Product();
			p.accept();
	        productController.addProduct(p);
			break;
		case 2:
			System.out.println("Inside Display Product");
			productController.displayAll();
			break;
		case 3:
			System.out.println("Inside Update Product");
			System.out.println("Enter Product Id");
	        int id = sc.nextInt();
	        productController.updateProductById(id);
			break;
		case 4:
			System.out.println("Inside Delete Product");
			System.out.println("Enter Product title");
	        String title = sc.nextLine();
	        sc.nextLine(); 
			productController.deleteProductByTitle(title);
			break;
		case 5:
			productController.saveProducts();
			System.out.println("Thank You Visit again !!!!!");
			break;
		default:
			System.out.println("Please Enter a correct option....");
			break;
		}
        }while(option!=5);
       
	}

}
