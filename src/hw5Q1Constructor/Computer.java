package hw5Q1Constructor;

import hw1JavaBasic.MySelf;

public class Computer {

	public String brand;// variable declare.
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {// Constructor declare.

		System.out.println("This is from the default Constructor of Computer class");

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {// this
																													// parameterized
																													// constructor.

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("\nMy Brand: " + brand + " \nMy Model: " + model + " \nMy Operating System:"
				+ operatingSystem + " \nMy Price :" + price + " \nMy Grade:" + grade + " \nMade In USA:" + madeInUSA);
	}
}
