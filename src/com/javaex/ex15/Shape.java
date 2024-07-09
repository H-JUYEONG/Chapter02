package com.javaex.ex15;

public abstract class Shape {

	// 필드
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	/*
	public void draw() {
		System.out.println("오버라이딩용입니다.");
	}
	*/
	
	// 오버라이딩 전용: abstract 예약어 사용, 내용을 포현하는곳이 없다.
	public abstract void draw();
	
	/*
	 abstract 메소드를 가지고 있는 클래스는 메모리에 올릴수 없다.
	 따라서 클래스에도 abstract 예약어 사용
	 상속 전용
	*/
}
