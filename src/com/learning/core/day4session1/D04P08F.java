package com.learning.core.day4session1;

import java.util.Map;
import java.util.TreeMap;

public class D04P08F {
	public static void main(String[] args) {
		TreeMap<Car, Double> carMap = new TreeMap<>();

		carMap.put(new Car("Bugatti", 80050.0), 80050.0);
		carMap.put(new Car("Swift", 305000.0), 305000.0);
		carMap.put(new Car("Audi", 600100.0), 600100.0);
		carMap.put(new Car("Benz", 900000.0), 900000.0);
		System.out.println("The price of the car in reverse order:");
		for (Map.Entry<Car, Double> entry : carMap.descendingMap().entrySet()) {
			System.out.println(entry.getKey());
		}
	}
}
