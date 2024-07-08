package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4, 4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10, 10, "red");
		
		p.showInfo1();
		cp1.showInfo2();
		cp2.showInfo3();
	}

}