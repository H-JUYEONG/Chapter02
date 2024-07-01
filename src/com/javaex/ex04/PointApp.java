package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point point1 = new Point();

		point1.setX(5);
		point1.setY(5);

		Point point2 = new Point();

		point2.setX(10);
		point2.setY(23);

		//출력
		point1.draw();
		point2.draw();

	}

}
