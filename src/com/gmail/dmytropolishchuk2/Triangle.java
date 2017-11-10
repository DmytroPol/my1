package com.gmail.dmytropolishchuk2;

public class Triangle {
	private double firstSide;
	private double secondSide;
	private double thirdSide;

	public Triangle(double firstSide, double secondSide, double thirdSide) {
		super();
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}

	public Triangle() {
		super();

	}

	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide(double firstSide) {
		this.firstSide = firstSide;
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		this.secondSide = secondSide;
	}

	public double getThirdSide() {
		return thirdSide;
	}

	public void setThirdSide(double thirdSide) {
		this.thirdSide = thirdSide;
	}

	public double calculatePerimetr() {
		return firstSide + secondSide + thirdSide;
	}

	public double calculateArea() {
		double polP = (firstSide + secondSide + thirdSide) / 2;
		return Math.sqrt(polP * (polP - firstSide) * (polP - secondSide) * (polP - thirdSide));
	}

	@Override
	public String toString() {
		return "[" + "firstSide " + firstSide + ", secondSide: " + secondSide + ", thirdSide: " + thirdSide + "]";
	}
}