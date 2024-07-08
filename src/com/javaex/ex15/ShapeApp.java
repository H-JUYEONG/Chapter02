package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		// 사각형
		Rectangle r01 = new Rectangle(3, 5, "빨강", "노랑");

		// 원
		Circle c01 = new Circle(10, "파랑", "노랑");

		// 삼각형
		Triangle t01 = new Triangle(13, 15, "보라", "주황");

		Shape[] sArray = new Shape[3];

		// 섞어쓰기
		// 사각형 --> 도형
		Shape s01 = new Rectangle(3, 5, "빨강", "노랑");

		// 원 --> 도형
		Shape s02 = new Circle(10, "파랑", "노랑");

		// 원 --> 삼각형
		Shape s03 = new Triangle(13, 15, "보라", "주황");

		// 1개의 배열로 관리
		sArray[0] = s01; // 사각형 --> 도형
		sArray[1] = s02; // 원 --> 도형
		sArray[2] = s03; // 삼각형 --> 도형

		/*
		System.out.println(sArray[0].toString()); // 메소드 오버라이딩
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].toString());
			
		}*/
		
		for (int i = 0; i < sArray.length; i++) { // 메소드 오버라이딩
			sArray[i].draw();
		}
		
		System.out.println(((Circle)s02).getRadius());
		System.out.println(((Rectangle)s01).getWidth());
	}
}
