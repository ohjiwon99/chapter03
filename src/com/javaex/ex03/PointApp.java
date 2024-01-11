package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {

		Point P00 = new Point(3, 5);
		Point P01 = new Point(3, 5);
		Point P02 = new Point(13, 15);
		Point P03 = P02;

		System.out.println(P00.equals(P01));// 논리비교
		System.out.println(P00 == P01);// 주소비교

		System.out.println(P01.equals(P02));// 논리비교
		System.out.println(P03.equals(P02));// 논리비교

		
	}

}
