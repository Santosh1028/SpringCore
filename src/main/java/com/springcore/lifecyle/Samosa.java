package com.springcore.lifecyle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void hey() {
		System.out.println("Hey Method");

	}

	public void bye() {
		System.out.println("Bye Method");

	}
}
