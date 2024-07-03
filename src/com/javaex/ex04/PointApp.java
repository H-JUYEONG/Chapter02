package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point();

		p01.setX(5);
		p01.setY(5);

		Point p02 = new Point();

		p02.setX(10);
		p02.setY(23);

		// 출력
		p01.draw();
		p02.draw();

		Point p03 = new Point(100,0); // x값만 세팅
		Point p04 = new Point(0,500); // y값만 세팅

	}

}
