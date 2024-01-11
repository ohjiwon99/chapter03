package com.javaex.ex02;

import com.javaex.ex03.Point;

public class PointApp {

	public static void main(String[] args) {
		
		Point P00 = new Point(3, 5);
		Point P01 = new Point(3, 5);
		Point P02 = new Point(13, 15);
		Point P03 = P02;

		
		  // 클래스 정보 보기 System.out.println(P00.getClass());
		  System.out.println(P01.getClass()); 
		  System.out.println(P02.getClass());
		  
		  
		  System.out.println("=========================");
		  
		  // tostring() System.out.println(P00.toString());
		  System.out.println(P01.toString()); 
		  System.out.println(P02.toString());
		  
		  System.out.println("=========================");
		  
		  // hashCode() System.out.println(P00.hashCode());
		  System.out.println(P01.hashCode()); 
		  System.out.println(P02.hashCode());
		  
		  System.out.println("=========================");
		  
		  //equals() System.out.println(P00.equals(P01));// p00 부모의 메소드 사용(로직은 같다)
		   System.out.println(P01.equals(P00));
		   // p01 부모의 메소드 사용(로직은 같다)
		 
		   System.out.println(P02.equals(P03));
		  
		
	}

}
