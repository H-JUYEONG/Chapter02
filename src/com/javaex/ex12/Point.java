package com.javaex.ex12;

public class Point {

	private int x;
	private int y;

	//기본 생성자
	public Point() {
		
	}

	//매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void showInfo1() {
		System.out.println("-----------------------");
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
		System.out.println("-----------------------");
	}

}