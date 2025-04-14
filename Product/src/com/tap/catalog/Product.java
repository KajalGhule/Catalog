package com.tap.catalog;

import java.io.Serializable;
import java.util.Scanner;


public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String desc;
	private double unitPrice;
	private int quantity;
	
	public Product() {
		this.id = 1;
		this.title = "Product";
		this.desc = "ProductDesc";
		this.unitPrice = 100;
		this.quantity = 10;
	}
	public Product(int id, String title, String desc, double unitPrice, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", desc=" + desc + ", unitPrice=" + unitPrice + ", quantity="
				+ quantity + "]";
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Id");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Product Title");
		this.title = sc.nextLine();
		System.out.println("Enter Product Desc");
		this.desc = sc.nextLine();
		System.out.println("Enter Product Price");
		this.unitPrice = sc.nextDouble();
		System.out.println("Enter Product Quantity");
		this.quantity = sc.nextInt();
	}
	public void display() {
		System.out.println(this.toString());
	}
}
