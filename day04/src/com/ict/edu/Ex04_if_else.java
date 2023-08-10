package com.ict.edu;

public class Ex04_if_else {
	public static void main(String[] args) {
//		if ~ else문 
//		조건이 참일때와 거짓일때 각각 나눠서 처리한다.
//		형식) if(조건식){조건식이 참일때 실행할 문장; ....문장2;
//				}else{조건식이 거짓일때 실행할 문장; ...문장2;}
		
//		int k1이 60이상이면 합격 아니면 불합격
		int k1 = 79;
		String str = "";
		
		if (k1 >= 60) {
			str = "합격";
		} else {
			str = "불합격";
		}
		System.out.println(str);
		
//		int k2가 홀수인지, 짝수인지 판별하자
		int k2 = 4;
		
		if (k2 % 2 == 1) {
			str = "홀수";
		} else {
			str= "짝수";
		}
		System.out.println(str);
		
//		char k3가 대문자인지, 대문자가 아닌지 판별하자
		char k3 =79;
		
		if (k3 >= 'A' && k3 <='Z') {
			str ="대문자";
		} else {
			str = "대문자 아님";
		}
		System.out.println(str);
		
//		근무시간이 8시간까지는 시간당 9620이고
//		8시간을 초과한 시간 만큼은 1.5배 지급한다.
//		현재 근무한 시간이 10시간이다
//		얼마를 받아야 하는가?
		int time = 10;
		int limit = 8;
		int dan = 9620;
		int pay = 0;
		
		if (time > limit) {
			pay = (limit * dan) + (int)((time-limit)* dan *1.5);
		} else {
			pay = (time*dan);
		}
		System.out.println(pay);
		
	}

}
