package test.pms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import test.pms.entity.Products;

public interface ProductDao extends JpaRepository<Products, Integer>{

	
}
