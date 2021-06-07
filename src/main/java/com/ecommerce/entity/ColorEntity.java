package com.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "color")
public class ColorEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int colorId;
	
	@NotEmpty
	private String colorName;
	
	@OneToMany(mappedBy = "color")
	private List<ProductDetailsEntity> productDetails;

	public ColorEntity() {
		super();
	}

	public ColorEntity(int colorId, String colorName, List<ProductDetailsEntity> productDetails) {
		super();
		this.colorId = colorId;
		this.colorName = colorName;
		this.productDetails = productDetails;
	}

	public int getColorId() {
		return colorId;
	}

	public void setColorId(int colorId) {
		this.colorId = colorId;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public List<ProductDetailsEntity> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetailsEntity> productDetails) {
		this.productDetails = productDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ColorEntity [colorId=" + colorId + ", colorName=" + colorName + ", productDetails=" + productDetails
				+ "]";
	}

	
	



	
}
