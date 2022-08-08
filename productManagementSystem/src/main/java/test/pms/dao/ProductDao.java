package test.pms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.pms.entity.Products;
@Repository
public interface ProductDao extends JpaRepository<Products, Integer>{

	List<Products> findByproductTitle(String productTitle);
}
