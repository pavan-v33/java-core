package com.learning.core.day4session1;

class Products {
	private String productId;
	private String productName;

	public Products(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return productId + " " + productName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Products product = (Products) o;
		return productId.equals(product.productId);
	}

	@Override
	public int hashCode() {
		return productId.hashCode();
	}

}
