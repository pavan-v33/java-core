package com.learning.core.day2session1;

interface MedicineInfo {
	void displayLabel();
}

class Tablet implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Store Tablets in a cool dry place.");
	}
}

class Syrup implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Syrup is consumable only on prescription.");
	}
}

class Oinment implements MedicineInfo {
	public void displayLabel() {
		System.out.println("Ointment is for external use only.");
	}
}

public class D02P02 {
	public static void main(String[] args) {
		MedicineInfo t = new Tablet();
		MedicineInfo s = new Syrup();
		MedicineInfo o = new Oinment();

		t.displayLabel();
		s.displayLabel();
		o.displayLabel();
	}

}