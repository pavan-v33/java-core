package com.learning.core.day4session1;

import java.util.HashSet;

public class D04P07C {
	public static void main(String[] args) {
		HashSet<Products> products = new HashSet<>();
		products.add(new Products("P001", "Maruti 800"));
		products.add(new Products("P002", "Maruti Zen"));
		products.add(new Products("P003", "Maruti Dezire"));
		products.add(new Products("P004", "Maruti Alto"));
		String productIdToSearch = "P007";
		if (searchProduct(products, productIdToSearch)) {
			System.out.println("Product Found");
		} else {
			System.out.println("Product Not Found");
		}
	}

	public static boolean searchProduct(HashSet<Products> products, String productId) {
		for (Products product : products) {
			if (product.getProductId().equals(productId)) {
				return true;
			}
		}
		return false;
	}
}
