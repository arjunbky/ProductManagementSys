package test.pms.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import test.pms.dao.ProductDao;
import test.pms.entity.Products;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
	
	public Products createProduct(Products product) {
//		Random rand=new Random();
//		int x=rand.nextInt(1000);
//		product.setProductNumber(x);

		return productDao.save(product);
		
	}
	
	public List<Products> getProducts(){
		System.out.println("hi------------------------------");
		return productDao.findAll();
	}
	
	public Products getProductById(int productId) {
		return productDao.findById(productId).get();
	}
	public List<Products> getProductByTitle(String title) {
		return productDao.findByproductTitle(title);
	}
	public String deleteProduct(int ProductId) {
		return null;
		
	}

}
