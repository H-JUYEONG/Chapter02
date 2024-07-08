package com.javaex.ex12;

public class ColorPoint extends Point {

	// 필드
	private String color;
	
	// 매개변수 생성자(자식)
	public ColorPoint(String color) {
		this.color = color;
	}

	// 매개변수 생성자(상속)
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void showInfo2() {
		System.out.println("-----------------------");
		System.out.println("색상: " + this.color);
		System.out.println("-----------------------");
	}
	
	public void showInfo3() {
		System.out.println("-----------------------");
		System.out.println("x: " + super.getX());
		System.out.println("y: " + super.getY());
		System.out.println("색상: " + this.color);
		System.out.println("-----------------------");
	}

}