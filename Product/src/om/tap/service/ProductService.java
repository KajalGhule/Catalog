package om.tap.service;

import com.tap.catalog.Product;
import com.tap.repositry.ProductRepo;

public class ProductService {
	ProductRepo productRepo = new ProductRepo();
	public void addProduct(Product product) {
		productRepo.addProduct(product);
    }
	public void displayAll() {
		productRepo.displayAll();
	}
	public Product updateProductById(int id) {
		Product existingProduct = productRepo.updateProductById(id);
		return existingProduct;
	}
	public void deleteProductByTitle(String title) {
		productRepo.deleteProductByTitle(title);
	}
	public void loadProducts() {
		productRepo.loadProducts();		
	}
	public void saveProducts() {
		productRepo.saveProducts();		
	}
}
