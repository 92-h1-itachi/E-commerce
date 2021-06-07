package com.ecommerce.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@NotEmpty
	private String productName;
	
	@OneToMany(mappedBy = "product")
	private List<CategoryEntity> category;
	
	@OneToMany(mappedBy = "product")
	private List<OrderDetailsEntity> orderdetails;
	
	@OneToMany(mappedBy = "product")
	private List<ProductDetailsEntity> productdetails;

	public ProductEntity() {
		super();
	}

	public ProductEntity(int productId, String productName, List<CategoryEntity> category,
			List<OrderDetailsEntity> orderdetails, List<ProductDetailsEntity> productdetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.orderdetails = orderdetails;
		this.productdetails = productdetails;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<CategoryEntity> getPromotion() {
		return category;
	}

	public void setPromotion(List<CategoryEntity> category) {
		this.category = category;
	}

	public List<OrderDetailsEntity> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrderDetailsEntity> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public List<ProductDetailsEntity> getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(List<ProductDetailsEntity> productdetails) {
		this.productdetails = productdetails;
	}

	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", orderdetails=" + orderdetails + ", productdetails=" + productdetails + "]";
	}
	
	
}
