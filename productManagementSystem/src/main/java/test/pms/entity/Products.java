package test.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Products")
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
	
	public Products() {
		// TODO Auto-generated constructor stub
	}
	public Products(int id, String productTitle, String productDescription, double productPrice, long productNumber) {
		super();
		this.id = id;
		this.productTitle = productTitle;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productNumber = productNumber;
	}

	@Column(name="productNumber")
	private long productNumber;

	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public long getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", productTitle=" + productTitle + ", productDescription=" + productDescription
				+ ", productPrice=" + productPrice + ", productNumber=" + productNumber + "]";
	}

	

}
