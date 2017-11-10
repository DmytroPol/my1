package com.gmail.dmytropolishchuk2;

public class Main {

	public static void main(String[] args) {
		Triangle oneTr = new Triangle(11, 18.5, 13);
		Triangle twoTr= new Triangle(13, 12, 13);
		Triangle threeTr = new Triangle(9,18.6,9.7);
		System.out.println(oneTr.calculatePerimetr());
		System.out.println(twoTr);
		System.out.println(threeTr.calculateArea());
	}

}
