package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a =3; //문제없음 toString안됌 왜냐 주소가 없으니까
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3)+new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01=3;//자동박싱
		System.out.println(v01.toString()); // toString됌

		int v02 = i; //자동언박싱
		System.out.println(v02);
		
		/*
		Integer r01=100;
		int result =r01.parseInt("1234567");
		System.out.println(result+3);*/
		
		//문자열 -->정수
		int result =Integer.parseInt("12345");
		System.out.println(result+3);
		
		/*String str = "안녕하세요";
		String result02 = str.valueOf(555);
		System.out.println(result02+2);*/
		
		//정수-->문자열
		String result02 = String.valueOf(999);
		System.out.println(result02+2);
		
		String result03 =""+999; //문자열 + 숫자 == 문자열이 됌 
		
		System.out.println("999"+"2");

		

	}

}
