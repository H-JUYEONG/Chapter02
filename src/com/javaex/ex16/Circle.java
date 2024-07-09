package com.javaex.ex16;

public class Circle extends Shape {

	// 필드 생성자 메소드gs 메소드일반 toString() draw() main에 원 3개출력
	private int radius;

	public Circle() {

	}

	public Circle(int radius, String fillColor, String lineColor) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("======원을 그렸습니다=======");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("=========================");
	}
	
	public double area() {
		return 3.14* radius * radius;
	}

}

