package com.java.lavanya.classes.inheritence;

public class Product {

	private int productId;
	public String productName;
	private String productDescription;
	private double price;

	public Product()
	{     
	}

	public Product(int productId, String productName, String        
			productDescription, double price)
	{
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
	}
    public String toString()
    {
        return "price=        " + price + ", productDescription=           "
                + productDescription + ", productId=           " + productId
                + ", productName=              " + productName;
    }
	public int getProductId()
	{
		return productId;
	}
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	public String getProductName()
	{
		return productName;
	}

	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductDescription()
	{
		return productDescription;
	}
	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}

}
