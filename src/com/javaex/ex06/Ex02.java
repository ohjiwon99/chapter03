package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {

		String a = new String(" abcd ");
		String b = new String(", efg ");

		/*
		 * System.out.println(a.concat(b)); System.out.println(b.concat(a));
		 * System.out.println(a+b);
		 */

		a = a.concat(b);// concat은 더하기지롱!
		System.out.println(a);

		a = a.trim();// trim은 공백을 없애주지롱!
		System.out.println(a);

		a = a.replace("ab", "12");// replace 문자 바꾸기지롱!
		System.out.println(a);

		System.out.println("-------------------------------------");

		String[] sArray = a.split(" , "); // 이건 배열이다!split은 ,(컴마)를 기준으로 잘라줘!!
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		System.out.println(a);

		System.out.println("-------------------------------------");

		String str = "Hello Java!";
		// 담아놓고 출력해도 되고, 한번만 쓸거면 바로 출려해도 된다.
		String result01 = str.substring(3);
		String result02 = str.substring(1, 7);

		System.out.println(result01);
		System.out.println(result02);

		System.out.println(str.substring(3));// 몇번째 방부터 촤르륵
		System.out.println(str.substring(7));
		System.out.println(str.substring(1));

		System.out.println(str.substring(1, 7));// 두개를 쓰면 처음 배열칸에서 마지막 배열칸 앞까지!!
		
		System.out.println("-------------------------------------");

		char result03 = str.charAt(8);
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("---------------------------------");
		
		String s01 = new String("안녕"); 
		String s02 = new String("안녕"); 
		
		if (s01==s02) {
			System.out.println("주소 같음");
		}else {
			System.out.println("주소 다름");
		}
		
		if (s01.equalsIgnoreCase(s02)) {
			System.out.println("글자 같음");
		}else {
			System.out.println("글자 다름");
		}
		
		System.out.println("---------------------------------");
		
		String s03 = "안녕"; // null이 오면 주소가 없다는 뜻!
		
		if (s03.equals("안녕")) {
			System.out.println("출력");
		}
		
		

	}
}
