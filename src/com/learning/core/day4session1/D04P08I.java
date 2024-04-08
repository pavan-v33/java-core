package com.learning.core.day4session1;

import java.util.Map;
import java.util.TreeMap;

public class D04P08I {
	public static void main(String[] args) {
		TreeMap<Car, Double> carMap = new TreeMap<>();

		carMap.put(new Car("Bugatti", 80050.0), 80050.0);
		carMap.put(new Car("Swift", 305000.0), 305000.0);
		carMap.put(new Car("Audi", 600100.0), 600100.0);
		carMap.put(new Car("Benz", 900000.0), 900000.0);

		double oldValue = 80050.0;
		double newValue = 80050.0;
		System.out.println("Replace the value mapped by the specified key with the new value: ");
		for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
			if (entry.getValue().equals(oldValue)) {
				entry.setValue(newValue);
				break;
			}
		}

		for (Map.Entry<Car, Double> entry : carMap.entrySet()) {
			System.out.println(entry.getKey());
		}
	}
}
