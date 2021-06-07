package com.ecommerce.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "promotion")
public class PromotionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int promotionId;
	
	@NotEmpty
	private String promotionName;
	
	@NotEmpty
	private Date starDate;
	
	@NotEmpty
	private Date andDate;
	
	@ManyToOne
	@JoinColumn(name = "productdetailsId")
	private ProductDetailsEntity productdetails;

	public PromotionEntity() {
		super();
	}

	public PromotionEntity(int promotionId, String promotionName, Date starDate, Date andDate,
			ProductDetailsEntity productdetails) {
		super();
		this.promotionId = promotionId;
		this.promotionName = promotionName;
		this.starDate = starDate;
		this.andDate = andDate;
		this.productdetails = productdetails;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionName() {
		return promotionName;
	}

	public void setPromotionName(String promotionName) {
		this.promotionName = promotionName;
	}

	public Date getStarDate() {
		return starDate;
	}

	public void setStarDate(Date starDate) {
		this.starDate = starDate;
	}

	public Date getAndDate() {
		return andDate;
	}

	public void setAndDate(Date andDate) {
		this.andDate = andDate;
	}

	public ProductDetailsEntity getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(ProductDetailsEntity productdetails) {
		this.productdetails = productdetails;
	}

	@Override
	public String toString() {
		return "PromotionEntity [promotionId=" + promotionId + ", promotionName=" + promotionName + ", starDate="
				+ starDate + ", andDate=" + andDate + ", productdetails=" + productdetails + "]";
	}
	
	
	
}
