package com.javaex.ex04;

public class Point {

	private int x;
	private int y;

	public void setX(int xx) {
		x = xx;
	}

	public int getX() {
		return x;
	}

	public void setY(int yy) {
		y = yy;
	}

	public int getY() {
		return y;
	}

	public void draw() {
		System.out.println("점[x=" + x + ", " + "y=" + y + "]을 그렸습니다.");
	}
}
