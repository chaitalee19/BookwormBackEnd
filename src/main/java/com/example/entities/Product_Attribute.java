package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Product_Attribute")
public class Product_Attribute {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	 public long prodAttId;

	@OneToOne
    @JoinColumn(name = "Attribute_Id")
    public long attributeId;

    @OneToOne
    @JoinColumn(name = "Product_Id")
    public long productId;
    
    
    public String attributeValue;
    
    
    public Product_Attribute() 
    {
    	
    }


	public long getProdAttId() {
		return prodAttId;
	}


	public void setProdAttId(long prodAttId) {
		this.prodAttId = prodAttId;
	}


	public long getAttributeId() {
		return attributeId;
	}


	public void setAttributeId(long attributeId) {
		this.attributeId = attributeId;
	}


	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getAttributeValue() {
		return attributeValue;
	}


	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
 
    
    
    

}
