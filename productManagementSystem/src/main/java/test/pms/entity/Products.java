package test.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Products {
	
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	@Column(name = "productTitle")
	private String productTitle;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@Column(name = "productPrice")
	private double productPrice;
	
	
	
	
	

}
