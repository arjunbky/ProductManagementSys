package test.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.pms.entity.Products;
import test.pms.service.ProductService;

@RestController
@RequestMapping(path  = "/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping(path = "/create")
	public ResponseEntity<String> createProduct(@RequestBody Products product){
		productService.createProduct(product);
		return new ResponseEntity<String>("CREATED",HttpStatus.CREATED);
	}
	@GetMapping(path="/getall")
	public ResponseEntity<List<Products>> getProducts(){
		List<Products> allProducts=productService.getProducts();
		System.out.println(allProducts);
		System.out.println("hi");
		return new ResponseEntity<List<Products>>(allProducts,HttpStatus.OK);
	}
	
}
