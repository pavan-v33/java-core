package com.learning.core.day4session1;

import java.util.HashSet;

public class D04P07D {
	public static void main(String[] args) {
		HashSet<Products> products = new HashSet<>();

		products.add(new Products("P001", "Maruti 800"));
		products.add(new Products("P002", "Maruti Zen"));
		products.add(new Products("P003", "Maruti Dezire"));
		products.add(new Products("P004", "Maruti Alto"));

		String productIdToRemove = "P003";
		removeProduct(products, productIdToRemove);

		listProductDetails(products);
	}

	public static void removeProduct(HashSet<Products> products, String productId) {
		Products productToRemove = null;
		for (Products product : products) {
			if (product.getProductId().equals(productId)) {
				productToRemove = product;
				break;
			}
		}
		if (productToRemove != null) {
			products.remove(productToRemove);
		}
	}

	public static void listProductDetails(HashSet<Products> products) {
		for (Products product : products) {
			System.out.println(product.getProductId() + " " + product.getProductName());
		}
	}
}
