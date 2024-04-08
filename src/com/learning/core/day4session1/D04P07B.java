package com.learning.core.day4session1;

import java.util.HashSet;

public class D04P07B {
	public static void main(String[] args) {
		HashSet<Products> products = new HashSet<>();
		products.add(new Products("P001", "Maruti 800"));
		products.add(new Products("P002", "Maruti Zen"));
		products.add(new Products("P003", "Maruti Dezire"));
		products.add(new Products("P004", "Maruti Alto"));
		System.out.println("List of All products: ");
		listProductDetails(products);
	}

	public static void listProductDetails(HashSet<Products> productslist) {
		for (Products product : productslist) {
			System.out.println(product.getProductId() + " " + product.getProductName());
		}
	}
}
