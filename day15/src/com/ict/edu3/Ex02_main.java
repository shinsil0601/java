package com.ict.edu3;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_calc calc = new Ex02_calc();
		
		int s1 = (int)calc.plus(9, 3);  //형변환
		System.out.println(s1);
		
		double s2 = calc.minus(9, 3);
		System.out.println(s2);
		
		double s3 = calc.mul(9, 3);
		System.out.println(s3);
		
		double s4 = calc.div(9, 3);
		System.out.println(s4);
		
		
	}
	
	
	
}
