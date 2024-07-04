package com.javaex.ex10;

public class Math {

	// 필드 -- 없음
	private static double pi = 3.145;

	// 생성자
	/*
	 * public Math() {}
	 */

	// 메소드 gs -- 없음

	// 메소드 일반

	// 메소드 오버로딩 사용
	// 공통으로 사용되는 plus를 static으로 생성
	public static int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}

	public static double plus(int a, double b) {
		double sum = a + b;
		return sum;
	}

	public static double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}

	//원의 넓이
	public static double circle(int radius) {
		double area = pi * radius * radius;
		return area;
	}
	
	//원의 둘레
}
