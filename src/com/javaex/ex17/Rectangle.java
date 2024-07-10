package com.javaex.ex17;

public class Rectangle extends Shape implements Drawable {

	// 필드
	private int width;
	private int height;

	// 생성자

	public Rectangle() {

	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		// 부모의 필드가 private일때
		/*
		 * super(); super.setFillColor(fillColor); super.setLineColor(lineColor);
		 */
		/*
		 * super(fillColor,lineColor);
		 */

		// 부모의 필드가 protected
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	public void draw() {
		System.out.println("====사각형을 그렸습니다======");
		System.out.println("가로: " + width);
		System.out.println("세로: " + height);
		System.out.println("=========================");
	}

	public double area() {
		return width * height;
	}

}
